package com.training;

import java.util.*;

public class Patient implements Comparable<Patient> {
	private long patientNumber;
	private String patientName;
	private String problemType;
	private int patientAge;

	public Patient(long patientNumber, String patientName, String problemType, int patientAge) {
		super();
		this.patientNumber = patientNumber;
		this.patientName = patientName;
		this.problemType = problemType;
		this.patientAge = patientAge;
	}

	@Override
	public int compareTo(Patient o) {

		return 0;
	}

	@Override
	public String toString() {
		return "Patient [patientNumber=" + patientNumber + ", patientName=" + patientName + ", problemType="
				+ problemType + ", patientAge=" + patientAge + "]";
	}

}
