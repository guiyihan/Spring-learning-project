package com.example.springbootapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;


import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {
    @LocalServerPort
    private int port;

    private URL base;
    @Autowired
    private TestRestTemplate template;

    @BeforeEach
    void setUp() throws MalformedURLException {
        this.base=new URL("http://localhost:"+port+"/");
    }

    @Test
    void name() {
        ResponseEntity<String> responseEntity=template.getForEntity(base.toString(),String.class);
        assertThat(responseEntity.getBody().equals("Welcome to my website!"));
    }
}
