package com.example.springboothomeworks.config;

import com.example.springboothomeworks.services.common.Chair;
import com.example.springboothomeworks.services.common.Table;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FurnitureConfig {
    @Bean
    public Chair createChair() {
        return new Chair();
    }

    @Bean
    public Table createTable() {
        return new Table();
    }
}
