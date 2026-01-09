package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {

    @GetMapping("/hotel")
    public String getData() {

<<<<<<< HEAD
        return "Last seesion ";
=======
        return " This changes happend from xyzde ";
>>>>>>> 329c25c345e8aa7cb6049ce68bff03fcce991b8b

    }
}
