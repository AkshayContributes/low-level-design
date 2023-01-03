package com.strategy.services.calculator;

import org.springframework.stereotype.Service;

@Service("divide")
public class Divide implements Compute{

  @Override public int compute(int a, int b) {
    return a/b;
  }
}
