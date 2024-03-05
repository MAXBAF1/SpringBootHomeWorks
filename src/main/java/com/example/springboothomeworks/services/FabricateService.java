package com.example.springboothomeworks.services;

import com.example.springboothomeworks.services.common.Chair;
import com.example.springboothomeworks.services.common.Table;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class FabricateService {
    public Chair chair;
    public Table table;

    @PostConstruct
    public void postConstruct() {
        log.info("Chair and table created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Chair and table destroyed");
    }
}
