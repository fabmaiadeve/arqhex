package com.fabdev.arqhex.application.core.usecase;

import com.fabdev.arqhex.application.core.domain.Customer;
import com.fabdev.arqhex.application.ports.out.FindAddressByZipCodeOutputPort;
import com.fabdev.arqhex.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {

        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(address);
        insertCustomerOutputPort.insert(customer);

    }
}
