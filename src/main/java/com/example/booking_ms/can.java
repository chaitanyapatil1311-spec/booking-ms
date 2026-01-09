package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class can {

    @GetMapping("/can")
    public String getData() {
        return "Please book flights ticket with 300% discount";
    }
}
