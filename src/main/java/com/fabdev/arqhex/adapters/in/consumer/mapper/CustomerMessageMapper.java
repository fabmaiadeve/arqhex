package com.fabdev.arqhex.adapters.in.consumer.mapper;

import com.fabdev.arqhex.adapters.in.consumer.message.CustomerMessage;
import com.fabdev.arqhex.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
