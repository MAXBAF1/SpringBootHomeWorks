package com.example.springboothomeworks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VKApiService {
    @Autowired
    private StudentService studentService; // DI через поле
}