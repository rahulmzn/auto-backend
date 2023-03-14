package com.auto.backend.repository;

import com.auto.backend.model.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FleetRepository extends JpaRepository<Fleet, Long> {


}