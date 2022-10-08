package com.example.maritimeassurance.exposition;

import com.example.application.ViewContracts;
import com.example.domain.entity.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ContractResource {

    @Autowired
    private ViewContracts viewContracts;

    @GetMapping(path = "/contract")
    public List<Contract> getAllContract() {
        return viewContracts.getContracts();
    }

    @GetMapping(path = "/contract/pagination")
    public Page<Contract> getAllContractByPage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size
    ) {
        return viewContracts.getContracts(PageRequest.of(page, size));
    }

    @PostMapping(path = "/contract")
    public Contract addContract(@RequestBody Contract contract) {
        return viewContracts.addContract(contract);
    }
}
