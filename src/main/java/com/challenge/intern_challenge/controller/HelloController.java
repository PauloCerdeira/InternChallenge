package com.challenge.intern_challenge.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String getMethodName(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
        return String.format("Olá %s!", name);
    }

    @GetMapping(value = "/createNewFile")
    public String createNewFile(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
        return "criar new file!";
    }

    @GetMapping(value = "/financialByTrader")
    public String getFinancialByTrader() {
        return "retornar financial by trader!";
    }

    @GetMapping(value = "/error")
    public String getError() {
        return "Unexpected error. Try again Later!";
    }

}
