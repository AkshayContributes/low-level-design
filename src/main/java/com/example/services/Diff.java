package com.example.services;

import org.springframework.stereotype.Service;

@Service("diff")
public class Diff implements Compute{

  @Override public int compute(int a, int b) {
    return a-b;
  }
}
