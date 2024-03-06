package com.example.springboothomeworks.services.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Table implements Furniture {
    @PostConstruct
    public void postConstruct() {
        log.info("Table created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Table destroyed");
    }
}
