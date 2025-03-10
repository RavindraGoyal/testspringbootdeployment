package com.testdeployment.test.repository;

import com.testdeployment.test.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameAgeRepositoruy extends JpaRepository<Test, Integer> {
}