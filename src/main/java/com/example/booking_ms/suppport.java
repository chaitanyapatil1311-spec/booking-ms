package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class suppport {

    @GetMapping("/support")
    public String getData() {
        return " Byw bye support team ";

    }
}
