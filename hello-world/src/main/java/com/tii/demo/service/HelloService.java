package com.tii.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    private final static Logger LOG = (Logger) LoggerFactory.getLogger(HelloService.class);
    
    public String getHelloWorld() {
        LOG.info("doing some stuff in the service here....");
        return "All your base are belong to us";
    }

}
