package com.cty.gatewayauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/Test")
    public String Test() {
        return "Hello World";
    }
}
