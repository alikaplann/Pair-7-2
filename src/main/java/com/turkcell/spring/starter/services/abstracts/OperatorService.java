package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Operator;

import java.util.List;

public interface OperatorService {
    void add(Operator operator);
    void delete(int operatorId);
    void update(int operatorOldId, Operator operatorNew);
    List<Operator> getAll();
}
