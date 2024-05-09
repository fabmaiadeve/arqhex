package com.fabdev.arqhex.application.ports.out;

import com.fabdev.arqhex.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
