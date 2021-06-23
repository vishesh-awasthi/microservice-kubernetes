package com.visheshawasthi.client.feign;

import com.visheshawasthi.client.feign.fallback.StateServiceFallBack;
import com.visheshawasthi.model.State;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "state-service", fallback = StateServiceFallBack.class)
public interface StateClientInterface {

    @GetMapping("/api/v1/states")
    ResponseEntity<List<State>> getStates(@RequestParam(name = "code") String code);

}
