package com.example.fivequestswithoop.controllers;

import com.example.fivequestswithoop.message.request.FindFirst;
import com.example.fivequestswithoop.service.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class QuestController {
    MyService myService;

    @PostMapping("/lightning")
    public ResponseEntity<?> lightning(@RequestBody double interval) {
        try {
            return ResponseEntity.ok().body(myService.lightning(interval));

        } catch (Exception e) {
            return ResponseEntity.status(403).body("Internal server error");
        }
    }

    @PostMapping("/find_first")
    public ResponseEntity<?> findFirst(@RequestBody FindFirst req) {
        try {
            return ResponseEntity.ok().body(myService.marathon(req.getName(), req.getTime()));

        } catch (Exception e) {
            return ResponseEntity.status(403).body("Internal server error");
        }
    }

    @PostMapping("/reverse_string")
    public ResponseEntity<?> reverseString(@RequestBody String test) {
        try {
            return ResponseEntity.ok().body(myService.recurcion(test));

        } catch (Exception e) {
            return ResponseEntity.status(403).body("Internal server error");
        }
    }

    @PostMapping("/is_palindrome")
    public ResponseEntity<?> isPalindrome(@RequestBody String text) {
        try {
            return ResponseEntity.ok().body(myService.isPalindrome(text));

        } catch (Exception e) {
            return ResponseEntity.status(403).body("Internal server error");
        }
    }

    @PostMapping("/time_in_days")
    public ResponseEntity<?> timeInDays(@RequestBody int day) {
        try {
            int[] tmp = myService.sytki(day);
            return ResponseEntity.ok().body(tmp[0] + " H, " + tmp[1] + " M, " + tmp[2] + " S");

        } catch (Exception e) {
            return ResponseEntity.status(403).body("Internal server error");
        }
    }
}