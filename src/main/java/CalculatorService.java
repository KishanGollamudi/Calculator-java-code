package com.houari.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double x, double y) { return x + y; }
    public double sub(double x, double y) { return x - y; }
    public double mul(double x, double y) { return x * y; }
    public double div(double x, double y) { return x / y; }

}
