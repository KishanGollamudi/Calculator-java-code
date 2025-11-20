package com.houari.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public double add(@RequestParam double x, @RequestParam double y) {
        return service.add(x, y);
    }

    @GetMapping("/sub")
    public double sub(@RequestParam double x, @RequestParam double y) {
        return service.sub(x, y);
    }

    @GetMapping("/mul")
    public double mul(@RequestParam double x, @RequestParam double y) {
        return service.mul(x, y);
    }

    @GetMapping("/div")
    public double div(@RequestParam double x, @RequestParam double y) {
        return service.div(x, y);
    }
}
