package com.example.services;

import org.springframework.stereotype.Service;

@Service("add")
public class Sum implements Compute{

  @Override public int compute(int a, int b) {
    return a+b;
  }
}
