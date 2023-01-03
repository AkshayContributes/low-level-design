package com.example.services;


import org.springframework.stereotype.Service;

@Service("AirIndia")
public class AirIndia implements FlightInfo{

  @Override public String displayFlightName() {
   return "Flying Air India";
  }
}
