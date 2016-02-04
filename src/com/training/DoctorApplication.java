package com.training;

import java.util.*;

public class DoctorApplication {

	public static void main(String[] args) {
		Doctor doc1 = new Doctor(148, "Dr. a", "y");
		Doctor doc2 = new Doctor(1048, "Dr. z", "c");
		Doctor doc3 = new Doctor(108, "Dr. c", "d");
		// TODO Auto-generated method stub
		NursingHome nursingHome = new NursingHome();
		nursingHome.addDoctor(doc1);
		nursingHome.addDoctor(doc2);
		nursingHome.addDoctor(doc3);

		Patient pat1 = new Patient(901, "jdfhjk", "wehjg", 231);
		Patient pat2 = new Patient(9701, "jdfhjk", "wehdhjg", 231);
		Patient pat3 = new Patient(9081, "jdfhfhjk", "wehjg", 23861);
		TreeSet<Patient> patients = new TreeSet<Patient>();
		// hash setr is not ordered on any way-comparable/comparator not
		// required
		// HashSet<Patient> patients=new HashSet<Patient>();
		patients.add(pat1);
		patients.add(pat2);
		patients.add(pat3);
		doc1.setPatients(patients);
		nursingHome.printDoctorList();
		nursingHome.printSortedDoctorList(1);

	}

}
