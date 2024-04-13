package com.annotations.Annotations.autowired.fields.usecase1;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyModelMapperConfig {
    // Using Bean annotation to create ModelMapper class Bean
    @Bean
    // Here the method name is the bean id/bean name
    public ModelMapper modelMapperBean(){
        // Return the ModelMapper object
        return new ModelMapper();
    }
}

