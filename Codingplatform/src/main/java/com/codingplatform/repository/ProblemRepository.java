package com.codingplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingplatform.model.Problem;

public interface ProblemRepository extends JpaRepository<Problem, Long>{

}
