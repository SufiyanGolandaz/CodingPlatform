package com.codingplatform.service;

import java.util.List;

import com.codingplatform.model.Problem;

public interface ProblemService {
	public Problem saveProblem(Problem problem);
	public List<Problem> getAllProblems();
	public Problem editProblem(Problem problem, Long id);
	public String deleteProblem(Long id);
	public Problem getProblemById(Long id);
}
