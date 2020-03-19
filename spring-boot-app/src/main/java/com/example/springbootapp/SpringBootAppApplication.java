package com.example.springbootapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
        return (args)->{
            System.out.println("print all spring boot beans");
            String[] beanList=applicationContext.getBeanDefinitionNames();
            Arrays.sort(beanList);
            for (String bean:
                 beanList) {
            }
        };
    }

}
