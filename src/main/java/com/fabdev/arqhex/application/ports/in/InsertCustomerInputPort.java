package com.fabdev.arqhex.application.ports.in;

import com.fabdev.arqhex.adapters.in.controller.request.CustomerRequest;
import com.fabdev.arqhex.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
