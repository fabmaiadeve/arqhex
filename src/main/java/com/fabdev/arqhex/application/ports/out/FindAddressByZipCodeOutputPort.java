package com.fabdev.arqhex.application.ports.out;

import com.fabdev.arqhex.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
