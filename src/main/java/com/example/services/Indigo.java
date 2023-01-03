package com.example.services;

import org.springframework.stereotype.Service;

@Service("Indigo")
public class Indigo implements FlightInfo{

  @Override public String displayFlightName() {
   return "Flying Indigo";
  }
}
