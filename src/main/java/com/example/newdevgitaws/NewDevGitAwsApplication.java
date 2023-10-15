package com.example.newdevgitaws;

import MainClass.FirstJava;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewDevGitAwsApplication {

    public static void main(String[] args) {
        // SpringApplication.run(NewDevGitAwsApplication.class);
        FirstJava java = new FirstJava();
        java.showName();
    }

}


