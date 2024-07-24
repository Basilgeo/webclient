package com.ust.State.controller;

import com.ust.State.dto.Responsedto;
import com.ust.State.model.State;
import com.ust.State.service.StateService;
import com.ust.State.service.StateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping("/addstate")
    public ResponseEntity<List<State>> addaAllStates(@RequestBody List<State> stateList){
        return ResponseEntity.ok(stateService.addAllStates(stateList));

    }

    @GetMapping("/getDistricts/{stateCode}")
    public ResponseEntity<Responsedto> getDistrictsByStateCode(@PathVariable("stateCode") String stateCode){
        Responsedto responseDto = stateService.getState(stateCode);
        return ResponseEntity.ok(responseDto);
    }




}
