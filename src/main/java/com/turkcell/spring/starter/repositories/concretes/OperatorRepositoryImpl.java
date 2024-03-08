package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Operator;
import com.turkcell.spring.starter.repositories.abstracts.OperatorRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OperatorRepositoryImpl implements OperatorRepository {
    private List<Operator> operatorList = new ArrayList<>();

    @Override
    public void add(Operator operator) {
        operatorList.add(operator);
    }

    @Override
    public void delete(int operatorId) {
        for (int i = 0; i < operatorList.size(); i++) {
            if (operatorList.get(i).getId() == operatorId) {
                operatorList.remove(i);
                break;
            }
        }
    }

    @Override
    public void update(int operatorOldId, Operator operatorNew) {
        for (int i = 0; i < operatorList.size(); i++) {
            if (operatorList.get(i).getId() == operatorOldId) {
                operatorList.set(i, operatorNew);
                break;
            }
        }
    }
    @Override
    public List<Operator> getAll() {
        return operatorList;
    }
}
