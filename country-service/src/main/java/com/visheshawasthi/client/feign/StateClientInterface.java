package com.visheshawasthi.client.feign;

import com.visheshawasthi.model.State;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "state-service", url = "http://state-service:8081")
public interface StateClientInterface {

    @GetMapping("/state-service/api/v1/states")
    ResponseEntity<List<State>> getStates(@RequestParam(name = "code") String code);

}
