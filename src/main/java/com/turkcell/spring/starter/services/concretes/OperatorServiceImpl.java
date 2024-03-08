package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Operator;
import com.turkcell.spring.starter.repositories.abstracts.OperatorRepository;
import com.turkcell.spring.starter.services.abstracts.OperatorService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
    public void delete(int operatorId) {
        operatorRepository.delete(operatorId);
    }

    @Override
    public void update(int operatorOldId, Operator operatorNew) {
        operatorRepository.update(operatorOldId, operatorNew);
    }

    @Override
    public List<Operator> getAll() {
        return null;
    }
}
