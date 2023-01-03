package com.example.services;

import org.springframework.stereotype.Service;

@Service("multiply")
public class Multiply implements Compute{

  @Override public int compute(int a, int b) {
    return a*b;
  }
}
