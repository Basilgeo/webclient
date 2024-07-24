package com.ust.District.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class District {

    @Id
    private Long districtId;
    private String districtName;
    private String stateName;
    private String stateCode;
}
