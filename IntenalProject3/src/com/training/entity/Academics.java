package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Academics {

	private double sub1;
	private double sub2;
	private double sub3;
	
	public Academics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSub1() {
		return sub1;
	}

	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}

	public double getSub2() {
		return sub2;
	}

	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}

	public double getSub3() {
		return sub3;
	}

	public void setSub3(double sub3) {
		this.sub3 = sub3;
	}

	public Academics(double sub1, double sub2, double sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	@Override
	public String toString() {
		return "Academics [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
	
	
}
