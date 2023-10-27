package com.codingplatform.model;

import java.util.ArrayList;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Problem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "problem_id")
	private Long id;
	private String title;
	private String description;
	private String inputFormat;
	private String outputFormat;
	private boolean issubmitted;
	
	@OneToOne(mappedBy = "problem")
	private Submissions submissions;
	
	@OneToOne(mappedBy = "problem")
	private Editorial editorial;
	
	public boolean isIssubmitted() {
		return issubmitted;
	}

	public void setIssubmitted(boolean issubmitted) {
		this.issubmitted = issubmitted;
	}

	public Problem() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInputFormat() {
		return inputFormat;
	}

	public void setInputFormat(String inputFormat) {
		this.inputFormat = inputFormat;
	}

	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	
}
