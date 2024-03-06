package com.example.springboothomeworks.services.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Chair implements Furniture {
    @PostConstruct
    public void postConstruct() {
        log.info("Chair created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Chair destroyed");
    }
}
