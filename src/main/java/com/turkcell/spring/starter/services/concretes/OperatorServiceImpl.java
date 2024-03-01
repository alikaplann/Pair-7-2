package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Operator;
import com.turkcell.spring.starter.repositories.abstracts.OperatorRepository;
import com.turkcell.spring.starter.services.abstracts.OperatorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorServiceImpl implements OperatorService {
    private OperatorRepository operatorRepository;

    public OperatorServiceImpl(OperatorRepository operatorRepository) {
        this.operatorRepository = operatorRepository;
    }

    @Override
    public void add(Operator operator) {
        operatorRepository.add(operator);
    }

    @Override
    public void delete(Operator operator) {
        operatorRepository.delete(operator);
    }

    @Override
    public void update(Operator operatorOld, Operator operatorNew) {
        operatorRepository.update(operatorOld, operatorNew);
    }

    @Override
    public List<Operator> getAll() {
        return null;
    }
}
