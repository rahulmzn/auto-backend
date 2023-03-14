package com.auto.backend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fleet_l")
@Getter
@Setter
public class Fleet {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "vehicle_description", nullable = false)
    private String vehicleDescription;

    @Column(name = "contract_end", nullable = false)
    private String contractEnd;

    @Column(name = "term", nullable = false)
    private Integer term;

    @Column(name = "highest_recorded_mileage", nullable = false)
    private String highestRecordedMileage;

    @Column(name = "hrm_date", nullable = false)
    private String hrmDate;

    @Column(name = "fuel_type", nullable = false)
    private String fuelType;

    @Column(name = "collection_arranged", nullable = false)
    private String collectionArranged;


}
