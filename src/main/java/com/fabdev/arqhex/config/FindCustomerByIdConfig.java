package com.fabdev.arqhex.config;

import com.fabdev.arqhex.adapters.out.FindAddressByZipCodeAdapter;
import com.fabdev.arqhex.adapters.out.FindCustomerByIdAdapter;
import com.fabdev.arqhex.adapters.out.InsertCustomerAdapter;
import com.fabdev.arqhex.application.core.usecase.FindCustomerByIdUseCase;
import com.fabdev.arqhex.application.core.usecase.InsertCustomerUseCase;
import com.fabdev.arqhex.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
