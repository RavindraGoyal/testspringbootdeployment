package com.testdeployment.test.service;

import com.testdeployment.test.model.Test;
import com.testdeployment.test.repository.NameAgeRepositoruy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameAgeService {

    @Autowired
    NameAgeRepositoruy nameAgeRepositoruy;

    public Test AddNameAge(Test test){
        return nameAgeRepositoruy.save(test);
    }
}
