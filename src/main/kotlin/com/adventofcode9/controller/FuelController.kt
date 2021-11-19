package com.adventofcode9.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FuelController {
    
    @GetMapping("/health")
    fun health(): ResponseEntity<String> {
        return ResponseEntity("Healthy", HttpStatus.OK)
    }
}