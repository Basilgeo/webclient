package com.ust.State.service;

import com.ust.State.dto.Districtdto;
import com.ust.State.dto.Responsedto;
import com.ust.State.dto.Statedto;
import com.ust.State.model.State;
import com.ust.State.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class StateServiceImpl implements StateService{

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private WebClient webClient;

    @Override
    public List<State> addAllStates(List<State> stateList) {
        return stateRepository.saveAll(stateList);
    }
    @Override
    public Responsedto getState(String stateCode) {
        Responsedto responseDto = new Responsedto();
        State state = stateRepository.findByStateCode(stateCode).orElseThrow(()-> new RuntimeException("State not found"));
        Statedto stateDto = mapToStateDto(state);
        List<Districtdto> districtdtoList = webClient.get()
                .uri("http://localhost:9098/district/getDistrict/" + state.getStateCode())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Districtdto>>() {}).block();
        responseDto.setState(stateDto);
        responseDto.setDistrict(districtdtoList);
        return responseDto;
    }
    private Statedto mapToStateDto(State state) {
        Statedto stateDto = new Statedto();
        stateDto.setStateName(state.getStateName());
        stateDto.setStateCode(state.getStateCode());
        return stateDto;
    }

}
