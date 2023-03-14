package com.auto.backend.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fleet")
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

    @Column(name = "highestRecordedMileage", nullable = false)
    private String highest_recorded_mileage;

    @Column(name = "hrmDate", nullable = false)
    private String hrm_date;

    @Column(name = "fuelType", nullable = false)
    private String fuel_type;

    @Column(name = "collectionArranged", nullable = false)
    private String collection_arranged;


}
