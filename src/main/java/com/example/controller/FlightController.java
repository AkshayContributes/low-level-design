package com.example.controller;

import com.example.services.Compute;
import com.example.services.ComputeRouter;
import com.example.services.FlightRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

  @Autowired
  private FlightRouter flightRouter;

  @Autowired
  private ComputeRouter computeRouter;

  @GetMapping(value= "/flightInfo", produces = {"application/json"})
  public ResponseEntity<String> getFlightInfo(@RequestParam(value = "flight", required = true) String flight){
    return ResponseEntity.accepted().body(flightRouter.displayName(flight));
  }

  @GetMapping(value="/", produces = {"application/json"})
  public ResponseEntity<String> getPing(){
    return ResponseEntity.accepted().body("Pong");
  }

  @GetMapping(value="/compute", produces = {"application/json"})
  public ResponseEntity<Integer> compute(@RequestParam(value="a") int a, @RequestParam(value = "b") int b, @RequestParam(value = "ops") String ops){
    return ResponseEntity.accepted().body(computeRouter.compute(a, b, ops));
  }


}
