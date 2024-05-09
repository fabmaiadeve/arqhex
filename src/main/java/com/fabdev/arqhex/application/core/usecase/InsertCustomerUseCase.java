package com.fabdev.arqhex.application.core.usecase;

import com.fabdev.arqhex.application.core.domain.Customer;
import com.fabdev.arqhex.application.ports.in.InsertCustomerInputPort;
import com.fabdev.arqhex.application.ports.out.FindAddressByZipCodeOutputPort;
import com.fabdev.arqhex.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }
    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
