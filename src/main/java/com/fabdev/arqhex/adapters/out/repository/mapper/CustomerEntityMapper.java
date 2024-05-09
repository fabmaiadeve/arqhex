package com.fabdev.arqhex.adapters.out.repository.mapper;

import com.fabdev.arqhex.adapters.out.repository.entity.CustomerEntity;
import com.fabdev.arqhex.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
