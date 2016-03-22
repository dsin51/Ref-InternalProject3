package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class AcademicsEvents {
	
	private double seminar;
	private double tecConnect;
	private double gD;
	
	public AcademicsEvents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSeminar() {
		return seminar;
	}

	public void setSeminar(double seminar) {
		this.seminar = seminar;
	}

	public double getTecConnect() {
		return tecConnect;
	}

	public void setTecConnect(double tecConnect) {
		this.tecConnect = tecConnect;
	}

	public double getgD() {
		return gD;
	}

	public void setgD(double gD) {
		this.gD = gD;
	}

	public AcademicsEvents(double seminar, double tecConnect, double gD) {
		super();
		this.seminar = seminar;
		this.tecConnect = tecConnect;
		this.gD = gD;
	}

	@Override
	public String toString() {
		return "AcademicsEvents [seminar=" + seminar + ", tecConnect=" + tecConnect + ", gD=" + gD + "]";
	}
	
	
	

}
