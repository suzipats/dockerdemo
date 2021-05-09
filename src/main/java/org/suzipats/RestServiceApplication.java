package org.suzipats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.suzipats.controller.GreetingController;

@SpringBootApplication
public class RestServiceApplication {

    private static Logger logger = LoggerFactory.getLogger(RestServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
        StringBuilder sb = new StringBuilder();
        for(String arg : args){
            sb.append(arg);
        }
        logger.info("Application {} started successfully with startup param-> {}", System.getenv("CONTAINER_NAME"), sb.toString());
    }

}
