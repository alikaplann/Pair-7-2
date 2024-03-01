package com.turkcell.spring.starter.repositories.abstracts;

import com.turkcell.spring.starter.entities.Operator;

import java.util.List;

public interface OperatorRepository {
    public void add(Operator operator);
    public void delete(Operator operator);
    public void update(Operator operatorOld, Operator operatorNew);
    public List<Operator> getAll();
}
