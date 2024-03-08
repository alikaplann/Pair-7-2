package com.turkcell.spring.starter.controllers;


import com.turkcell.spring.starter.entities.Operator;
import com.turkcell.spring.starter.services.abstracts.OperatorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operator")
public class OperatorController {

    private final OperatorService operatorService;

    public OperatorController(OperatorService operatorService) {
        this.operatorService = operatorService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Operator operator) {
        operatorService.add(operator);
    }

    @GetMapping("/get")
    public List<Operator> get() {
        return operatorService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int operatorId) {
        operatorService.delete(operatorId);
    }

    @PostMapping("/update")
    public void update(@RequestParam int operatorOldId, @RequestBody Operator operatorNew) {
        operatorService.update(operatorOldId, operatorNew);
    }


}
