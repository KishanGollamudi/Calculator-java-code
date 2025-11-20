package com.houarizegai.calculator.controller;

import com.houarizegai.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return service.add(a, b);
    }

    @GetMapping("/sub")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return service.subtract(a, b);
    }

    @GetMapping("/mul")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return service.multiply(a, b);
    }

    @GetMapping("/div")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return service.divide(a, b);
    }
}
