package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holiday {

    @GetMapping("/Holiday")
    public String getData() {
        return "Please book flights ticket with 30% discount On holidays";
    }
}
