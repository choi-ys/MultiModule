package com.example.projecta;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ProjectAApplication {

    public static void main(String[] args) {
        log.info("Project A is Running");
        SpringApplication.run(ProjectAApplication.class, args);
    }
}
