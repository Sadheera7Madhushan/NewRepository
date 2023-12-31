package com.example.newdevgitaws;

import com.example.newdevgitaws.advicer.ResourceNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NewDevGitAwsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(NewDevGitAwsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(NewDevGitAwsApplication.class);
    }

    @RequestMapping("/hello")
    public ResponseEntity<?> helloWorld() {
        throw new ResourceNotFoundException("Resource not found");
    }

}


