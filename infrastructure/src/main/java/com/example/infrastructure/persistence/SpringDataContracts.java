package com.example.infrastructure.persistence;

import com.example.domain.Contracts;
import com.example.domain.entity.Contract;
import com.example.infrastructure.referential.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public class SpringDataContracts implements Contracts {

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Contract add(Contract contract) {
        return contractRepository.save(contract);
    }
}
