package com.ust.State.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Responsedto {
    private Statedto state;
    private List<Districtdto> district;
}
