package com.example.newdevgitaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
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
    public String helloWorld() {
        return "Hello World!";
    }

}


