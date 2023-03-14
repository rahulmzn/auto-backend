package com.auto.backend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "competitors")
@Getter
@Setter
public class Competitors {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "activity", nullable = false)
    private String name;


}
