package com.auto.backend.controller;


import com.auto.backend.model.Competitors;
import com.auto.backend.model.Fleet;
import com.auto.backend.model.Prices;
import com.auto.backend.repository.FleetRepository;
import com.auto.backend.repository.CompetitorsRepository;
import com.auto.backend.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Validated
@RequiredArgsConstructor
public class AutoProvider {

    @Autowired
    FleetRepository fleetRepository;

    @Autowired
    CompetitorsRepository competitorsRepository;

    @Autowired
    PriceRepository priceRepository;

    @GetMapping(value = "/prices")
    ResponseEntity<List<Prices>> getPrices(){
        return ResponseEntity.ok(priceRepository.findAll());
    }
    @GetMapping(value = "/competitors")
    ResponseEntity<List<Competitors>> getCompetitors(){
        return ResponseEntity.ok(competitorsRepository.findAll());
    }
    @GetMapping(value = "/fleet")
    ResponseEntity<List<Fleet>> getFleet(){
        return ResponseEntity.ok(fleetRepository.findAll());
    }
}
