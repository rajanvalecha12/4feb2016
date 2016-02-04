package com.training;

import java.util.*;

import com.training.utils.MyComparators;

public class NursingHome {
	// creating Type Safe Ordered Collection
	private ArrayList<Doctor> docList;

	public NursingHome() {
		docList = new ArrayList<Doctor>();
	}

	public boolean addDoctor(Doctor doc) {

		boolean result = docList.add(doc);

		return result;
	}

	public void printDoctorList() {
		for (Doctor doc : docList) {
			System.out.println(doc);
			if (doc.getPatients() != null) {
				System.out.println("appointments");
				for (Patient pat : doc.getPatients()) {
					System.out.println(pat);
				}
			}
		}
	}

	public void printSortedDoctorList(int key) {
		MyComparators comp = new MyComparators();
		switch (key) {
		case 1:
			Collections.sort(docList);
			printDoctorList();
			break;
		case 2:

			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(docList, comp1);
			printDoctorList();
			break;
		case 3:
			MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
			Collections.sort(docList, comp2);
			printDoctorList();
			break;
		default:
			break;
		// reusing print function-I am the OP programmer
		}
	}
}
