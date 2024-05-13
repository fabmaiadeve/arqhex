package com.fabdev.arqhex.config;

import com.fabdev.arqhex.adapters.out.DeleteCustomerByIdAdapter;
import com.fabdev.arqhex.application.core.usecase.DeleteCustomerByIdUseCase;
import com.fabdev.arqhex.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
