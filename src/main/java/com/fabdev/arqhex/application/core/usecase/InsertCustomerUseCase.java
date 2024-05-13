package com.fabdev.arqhex.application.core.usecase;

import com.fabdev.arqhex.application.core.domain.Customer;
import com.fabdev.arqhex.application.ports.in.InsertCustomerInputPort;
import com.fabdev.arqhex.application.ports.out.FindAddressByZipCodeOutputPort;
import com.fabdev.arqhex.application.ports.out.InsertCustomerOutputPort;
import com.fabdev.arqhex.application.ports.out.SendCpfValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfValidationOutputPort sendCpfValidationOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendCpfValidationOutputPort sendCpfValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfValidationOutputPort = sendCpfValidationOutputPort;
    }
    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfValidationOutputPort.send(customer.getCpf());
    }
}
