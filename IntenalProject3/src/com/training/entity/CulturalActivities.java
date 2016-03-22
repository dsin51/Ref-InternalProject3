package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class CulturalActivities {
	
	private double act1;
	private double act2;
	private double act3;
	
	public CulturalActivities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getAct1() {
		return act1;
	}

	public void setAct1(double act1) {
		this.act1 = act1;
	}

	public double getAct2() {
		return act2;
	}

	public void setAct2(double act2) {
		this.act2 = act2;
	}

	public double getAct3() {
		return act3;
	}

	public void setAct3(double act3) {
		this.act3 = act3;
	}

	public CulturalActivities(double act1, double act2, double act3) {
		super();
		this.act1 = act1;
		this.act2 = act2;
		this.act3 = act3;
	}

	@Override
	public String toString() {
		return "CulturalActivities [act1=" + act1 + ", act2=" + act2 + ", act3=" + act3 + "]";
	}

	
	
	
}
