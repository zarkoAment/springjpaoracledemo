package com.spring.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringOracle {

    public static void main(String[] args) {
        SpringApplication.run(SpringOracle.class, args);
    }
}
