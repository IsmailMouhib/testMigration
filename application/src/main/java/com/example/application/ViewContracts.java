package com.example.application;

import com.example.domain.entity.Contract;
import com.example.domain.Contracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ViewContracts {

    @Autowired
    private Contracts springDataContracts;

    public List<Contract> getContracts() {
        return springDataContracts.findAll();
    }

    public Page<Contract> getContracts(Pageable pageable) {
        return springDataContracts.findAll(pageable);
    }

    public Contract addContract(Contract contract) {
        return springDataContracts.add(contract);
    }
}
