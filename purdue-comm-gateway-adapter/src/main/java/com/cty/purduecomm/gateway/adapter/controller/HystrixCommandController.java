package com.cty.purduecomm.gateway.adapter.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HystrixCommandController {

    @RequestMapping("/hystrixTimeout")
    public String hystrixTimeout() {
        log.error("authorization-service触发了断路由");
        return "Timeout";
    }

    @HystrixCommand(commandKey = "authHystrixCommand")
    public void authHystrixCommand() {
        log.info("authorization-service触发了");
    }
}
