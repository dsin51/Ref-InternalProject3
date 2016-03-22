package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Sports {
	
	private double sport1;
	private double sport2;
	private double sport3;
	
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSport1() {
		return sport1;
	}

	public void setSport1(double sport1) {
		this.sport1 = sport1;
	}

	public double getSport2() {
		return sport2;
	}

	public void setSport2(double sport2) {
		this.sport2 = sport2;
	}

	public double getSport3() {
		return sport3;
	}

	public void setSport3(double sport3) {
		this.sport3 = sport3;
	}

	public Sports(double sport1, double sport2, double sport3) {
		super();
		this.sport1 = sport1;
		this.sport2 = sport2;
		this.sport3 = sport3;
	}

	@Override
	public String toString() {
		return "Sports [sport1=" + sport1 + ", sport2=" + sport2 + ", sport3=" + sport3 + "]";
	}

	
}
