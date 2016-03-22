package com.training.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonalInfo {

	
	private String name;
	private String roll;
	private String department;
	
	@Autowired
	private Academics subjects;
	@Autowired
	private AcademicsEvents academicsEvents;
	@Autowired
	private CulturalActivities culturalActivities;
	@Autowired
	private Sports sports;
	
	
	public PersonalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

	public Academics getSubjects() {
		return subjects;
	}

	public void setSubjects(Academics subjects) {
		this.subjects = subjects;
	}

	public AcademicsEvents getAcademicsEvents() {
		return academicsEvents;
	}

	public void setAcademicsEvents(AcademicsEvents academicsEvents) {
		this.academicsEvents = academicsEvents;
	}

	public CulturalActivities getCulturalActivities() {
		return culturalActivities;
	}

	public void setCulturalActivities(CulturalActivities culturalActivities) {
		this.culturalActivities = culturalActivities;
	}

	public Sports getSports() {
		return sports;
	}

	public void setSports(Sports sports) {
		this.sports = sports;
	}

	public PersonalInfo(String name, String roll, String department) {
		super();
		this.name = name;
		this.roll = roll;
		this.department = department;
	}

	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", roll=" + roll + ", department=" + department + ", subjects=" + subjects
				+ ", academicsEvents=" + academicsEvents + ", culturalActivities=" + culturalActivities + ", sports="
				+ sports + "]";
	}

	
	
	
}
