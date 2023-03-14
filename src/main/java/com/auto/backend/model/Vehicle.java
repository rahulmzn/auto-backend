package com.auto.backend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
public class Vehicle {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


}
