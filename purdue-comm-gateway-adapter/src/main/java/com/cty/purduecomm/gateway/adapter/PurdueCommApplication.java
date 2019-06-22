package com.cty.purduecomm.gateway.adapter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.cty.purduecomm.gateway")
@MapperScan("com.cty.purduecomm.gateway.infrastructure.persistant.mapper")
public class PurdueCommApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurdueCommApplication.class, args);
    }

}

