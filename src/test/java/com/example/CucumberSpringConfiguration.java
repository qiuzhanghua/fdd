package com.example;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
//@ContextConfiguration(classes = SpringTestConfiguration.class)
@SpringBootTest(classes = SpringTestConfiguration.class)
public class CucumberSpringConfiguration {
}
