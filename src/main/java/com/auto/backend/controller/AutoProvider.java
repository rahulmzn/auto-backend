package com.auto.backend.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@Validated
@RequiredArgsConstructor
public class AutoProvider {

    @GetMapping(value = "/auto")
    ResponseEntity<List<String>> picklistDataForCustomer(){

        return ResponseEntity.ok(Arrays.asList("test","test1"));
    }
}
