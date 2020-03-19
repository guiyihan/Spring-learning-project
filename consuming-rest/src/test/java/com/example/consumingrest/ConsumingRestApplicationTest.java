package com.example.consumingrest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConsumingRestApplication.class)
class ConsumingRestApplicationTest {
    @Autowired
    CommandLineRunner runner;
    @Test
    void run() {
        System.out.println(runner);
    }
}