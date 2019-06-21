package com.cty.purduecomm.gateway.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cty.purduecomm.gateway"})
public class PurdueCommApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurdueCommApplication.class, args);
    }

}

