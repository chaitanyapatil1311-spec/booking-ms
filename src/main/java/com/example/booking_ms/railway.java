package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railway {

    @GetMapping("/railway")
    public String getData() {
        return "Please book hotel ticket with 30% discount on railway ticket";
    }
}