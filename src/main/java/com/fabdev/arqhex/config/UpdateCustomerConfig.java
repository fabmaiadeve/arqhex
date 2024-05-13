package com.fabdev.arqhex.config;

import com.fabdev.arqhex.adapters.out.FindAddressByZipCodeAdapter;
import com.fabdev.arqhex.adapters.out.UpdateCustomerAdapter;
import com.fabdev.arqhex.application.core.usecase.FindCustomerByIdUseCase;
import com.fabdev.arqhex.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
