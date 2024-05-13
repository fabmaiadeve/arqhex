package com.fabdev.arqhex.config;

import com.fabdev.arqhex.adapters.out.FindAddressByZipCodeAdapter;
import com.fabdev.arqhex.adapters.out.InsertCustomerAdapter;
import com.fabdev.arqhex.adapters.out.SendCpfValidationAdapter;
import com.fabdev.arqhex.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
