package com.ust.District.service;


import com.ust.District.model.District;
import com.ust.District.repo.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    public  List<District> addDistricts(List<District> districtList){
        return districtRepository.saveAll(districtList);
    }

    public List<District> getDistrict(String stateCode)
    {
            return districtRepository.findByStateCode(stateCode);

    }
}
