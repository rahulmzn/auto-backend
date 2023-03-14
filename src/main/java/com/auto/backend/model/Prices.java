package com.auto.backend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prices")
@Getter
@Setter
public class Prices {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "activity", nullable = false)
    private String activity;


    @Column(name = "price", nullable = false)
    private String price;


}
