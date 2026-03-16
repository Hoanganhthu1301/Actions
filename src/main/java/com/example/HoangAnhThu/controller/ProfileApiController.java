package com.example.HoangAnhThu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProfileApiController {

    @GetMapping("/api/profile")
    public Map<String, String> getProfile() {
        return Map.of(
                "name", "Hoàng Anh Thư",
                "role", "Java Developer",
                "email", "hoanganhthu1261@email.com",
                "phone", "0359277881",
                "github", "github.com/hoanganhthu1301"
        );
    }
}