package com.turkcell.spring.starter.controllers;


import com.turkcell.spring.starter.entities.Address;
import com.turkcell.spring.starter.entities.Operator;
import com.turkcell.spring.starter.services.abstracts.AddressService;
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

        @PostMapping
        public void add(@RequestBody Operator operator)
        {
            operatorService.add(operator);
        }
        @GetMapping
        public List<Operator> get() {
            return operatorService.getAll();
        }

        @DeleteMapping
        public void delete(@RequestBody Operator operator) {
            operatorService.delete(operator);
        }

        @PostMapping
        public void update(Operator operatorOld, Operator operatorNew) {
            operatorService.update(operatorOld, operatorNew);
        }


    }
