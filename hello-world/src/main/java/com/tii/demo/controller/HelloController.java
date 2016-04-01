package com.tii.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tii.demo.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    private final static Logger LOG = (Logger) LoggerFactory.getLogger(HelloController.class);
    
    private final HelloService helloService;
    
    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        LOG.info("returning some stuff here...");
        return helloService.getHelloWorld();
    }
    
    
    /*
     * TODO:// 
     *  - stand up endpoint that takes a parameter, then outputs it in a service method 
     * 
     * 
     * 
     * 
     */

}
