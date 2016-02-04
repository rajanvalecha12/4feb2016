package com.training.utils;

import java.util.*;

import com.training.Doctor;

public class MyComparators {
	// inner class used
	public class NameComparator implements Comparator<Doctor> {

		@Override
		public int compare(Doctor o1, Doctor o2) {
			// string class already implements comparable
			// TODO Auto-generated method stub
			return o1.getDoctorName().compareTo(o2.getDoctorName());
		}

	}

	public class SpecializationComparator implements Comparator<Doctor> {

		@Override
		public int compare(Doctor o1, Doctor o2) {
			// TODO Auto-generated method stub
			return o1.getSpecialization().compareTo(o2.getSpecialization());
		}

	}

}
