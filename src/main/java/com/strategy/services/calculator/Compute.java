package com.strategy.services.calculator;

import org.springframework.stereotype.Service;

@Service
public interface Compute {

    public int compute(int a, int b);
}
