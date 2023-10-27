package com.codingplatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingplatform.model.Problem;
import com.codingplatform.repository.ProblemRepository;

@Service
public class ProblemServiceImpl implements ProblemService{
	
	@Autowired
	private ProblemRepository problemRepository;
	
	@Override
	public Problem saveProblem(Problem problem) {
		// TODO Auto-generated method stub

		return problemRepository.save(problem);
	}

	@Override
	public List<Problem> getAllProblems() {
		// TODO Auto-generated method stub
		return problemRepository.findAll();
	}

	@Override
	public Problem editProblem(Problem problem, Long id) {
		// TODO Auto-generated method stub
		Problem oldProblem=problemRepository.findById(id).get();
		oldProblem.setDescription(problem.getDescription());
		oldProblem.setId(problem.getId());
		oldProblem.setInputFormat(problem.getInputFormat());
		oldProblem.setOutputFormat(problem.getOutputFormat());
		oldProblem.setIssubmitted(problem.isIssubmitted());
		oldProblem.setTitle(problem.getTitle());
		return problemRepository.save(oldProblem);
	}

	@Override
	public String deleteProblem(Long id) {
		// TODO Auto-generated method stub
		Problem currProblem=problemRepository.findById(id).get();
		if(currProblem !=null) {
			problemRepository.delete(currProblem);
			return "Problem deleted successfully";
		}
		
		return "Problem not found";
		
	}

	@Override
	public Problem getProblemById(Long id) {
		// TODO Auto-generated method stub
		return problemRepository.findById(id).get();
	}

}
