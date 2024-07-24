package com.ust.State.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Districtdto {
    private Long districtId;
    private String districtName;
    private String stateName;
    private String stateCode;

}
