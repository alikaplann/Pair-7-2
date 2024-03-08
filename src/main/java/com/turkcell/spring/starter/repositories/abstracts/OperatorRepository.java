package com.turkcell.spring.starter.repositories.abstracts;

import com.turkcell.spring.starter.entities.Operator;

import java.util.List;

public interface OperatorRepository {
    public void add(Operator operator);
    public void delete(int operatorId);
    public void update(int operatorOldId, Operator operatorNew);
    public List<Operator> getAll();
}
