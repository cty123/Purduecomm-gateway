package com.cty.purduecomm.gateway.adapter.controller;

import com.cty.purduecomm.gateway.domain.entity.AuthUser;
import com.cty.purduecomm.gateway.domain.service.AuthUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class TestController {

    private AuthUserService authUserService;

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


    @PostMapping("/test")
    public void test(@RequestBody AuthUser authUser) {
        authUserService.insertAuthUser(authUser);
    }
}
