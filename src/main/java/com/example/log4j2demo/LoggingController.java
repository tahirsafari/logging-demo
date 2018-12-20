package com.example.log4j2demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    private static final Logger LOG = LoggerFactory.getLogger(LoggingController.class);
    @Autowired
    private LoggingService logingService;

    @RequestMapping("/log")
    public String getGreeting() {

        LOG.info("Request received. PathVariable is: [{}]", 123);
        logingService.logRequest();

        return "logging ";
    }
}
