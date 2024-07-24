package com.ust.State.service;

import com.ust.State.dto.Responsedto;
import com.ust.State.model.State;

import java.util.List;

public interface StateService {
    List<State> addAllStates(List<State> stateList);

    Responsedto getState(String stateCode);

}
