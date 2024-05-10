package com.fabdev.arqhex.application.ports.in;

import com.fabdev.arqhex.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
