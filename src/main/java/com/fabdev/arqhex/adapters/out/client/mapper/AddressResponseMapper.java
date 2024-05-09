package com.fabdev.arqhex.adapters.out.client.mapper;

import com.fabdev.arqhex.adapters.out.client.response.AddressResponse;
import com.fabdev.arqhex.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
