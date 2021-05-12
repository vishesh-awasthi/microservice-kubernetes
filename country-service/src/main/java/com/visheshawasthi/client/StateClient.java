package com.visheshawasthi.client;

import com.visheshawasthi.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Component
public class StateClient {

    @Autowired
    private final RestTemplate restTemplate;

    @Value("${client.state.url}")
    private String stateClient;

    public StateClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Gets the states.
     *
     * @param countryCode represents country unique aplha3Code.
     * @return {@link List<State>}
     */
    public List<State> getStates(String countryCode) {
        ResponseEntity<State[]> response = restTemplate.getForEntity(stateClient + countryCode, State[].class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody()!= null ? List.of(response.getBody()) : Collections.emptyList();
        }
        return null;
    }
}
