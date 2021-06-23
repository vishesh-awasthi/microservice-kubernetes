package com.visheshawasthi.client.feign.fallback;

import com.visheshawasthi.client.feign.StateClientInterface;
import com.visheshawasthi.model.State;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;

public class StateServiceFallBack implements StateClientInterface {
    @Override
    public ResponseEntity<List<State>> getStates(String code) {
        return new ResponseEntity<>(Collections.emptyList(), HttpStatus.OK);
    }
}
