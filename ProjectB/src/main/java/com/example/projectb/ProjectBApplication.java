package com.example.projectb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ProjectBApplication {

    public static void main(String[] args) {
        log.info("Project B is Running");
        SpringApplication.run(ProjectBApplication.class, args);
    }
}
