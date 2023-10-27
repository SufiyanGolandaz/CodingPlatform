package com.codingplatform.model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Submissions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String language;
	private String source_code;
	private String result;
	private Date executiontime;
	
	@OneToOne
	@JoinColumn(name="problem_id")
	private Problem problem;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSource_code() {
		return source_code;
	}
	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getExecutiontime() {
		return executiontime;
	}
	public void setExecutiontime(Date executiontime) {
		this.executiontime = executiontime;
	}
	public Problem getProblem() {
		return problem;
	}
	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	public Submissions() {
		
	}
}
