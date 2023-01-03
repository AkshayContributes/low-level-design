package com.example.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ComputeRouter {

  @Autowired
  private final Map<String, Compute> computeMap;

  public Integer compute(int a, int b, String ops){
    return computeMap.get(ops).compute(a, b);
  }

}
