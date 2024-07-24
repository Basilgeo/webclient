package com.ust.District.controller;

import com.ust.District.model.District;
import com.ust.District.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired

    private DistrictService districtService;

    @PostMapping("/adddistrict")
    public List<District> addDistricts(@RequestBody List<District> districtList  ) {
       return districtService.addDistricts(districtList);
    }

    @GetMapping("/getDistrict/{stateCode}")
    public List<District> getDistrict(@PathVariable String stateCode) {
        return districtService.getDistrict(stateCode);
    }

}
