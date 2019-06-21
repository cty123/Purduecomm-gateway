package com.cty.purduecomm.gateway.adapter.controller;

// import com.cty.purduecomm.service.AuthUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class TestController {

//    private final AuthUserService authUserService;

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

//    @GetMapping("/test")
//    public void test() {
//        authUserService.insertNewUser();
//    }
}
