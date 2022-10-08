package com.example.domain;

import com.example.domain.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Contracts {
    List<Contract> findAll();

    Page<Contract> findAll(Pageable pageable);

    Contract add(Contract contract);
}
