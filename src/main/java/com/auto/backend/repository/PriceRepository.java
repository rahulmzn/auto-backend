package com.auto.backend.repository;

import com.auto.backend.model.Fleet;
import com.auto.backend.model.Prices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<Prices, Long> {

List<Prices> findByPrice(String prices);

}