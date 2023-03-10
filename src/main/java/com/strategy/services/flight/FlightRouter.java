package com.strategy.services.flight;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FlightRouter {

    @Autowired
    private Map<String, FlightInfo> flightInfoMap;

  public String displayName(String flightChoice){
      return flightInfoMap.get(flightChoice).displayFlightName();
  }


}
