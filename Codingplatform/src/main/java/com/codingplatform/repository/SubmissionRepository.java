package com.codingplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingplatform.model.Submissions;

public interface SubmissionRepository  extends JpaRepository<Submissions, Long>{

}
