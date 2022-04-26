package com.hotel.management.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @RequestMapping("/create")
    public ResponseEntity<String> createBooking(){
        return null;
    }

    @RequestMapping("/create1")
    public ResponseEntity<String> createBooking1(){
        return null;
    }



}
