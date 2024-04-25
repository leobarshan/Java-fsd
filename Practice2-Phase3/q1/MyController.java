package com.proj2.q1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        try {
            // Simulating a situation where an exception occurs
            if (true) {
                throw new CustomException("Error occurred while fetching data");
            }
            return new ResponseEntity<>("Data fetched successfully", HttpStatus.OK);
        } catch (CustomException ex) {
            return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
