package com.example.springboothomeworks.services;

import com.example.springboothomeworks.services.common.Chair;
import com.example.springboothomeworks.services.common.Table;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
public class FabricateService {
    public Chair chair;
    public Table table;
}
