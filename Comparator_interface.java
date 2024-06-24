package hw3;

//A Java program to demonstrate Comparator interface 


//Time Complexity O(nlogn)

import java.io.*;
import java.util.*;

//A class 'Student' that implements Comparable 
class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private String major;
	private double gpa;

	// Implement the following method, so that students can be sorted by their
	// last name
	
	public Student() {
		
	}
	
	public int compareTo(Student m) {
		// YOUR CODES
		
		
//		if(this.lastName.charAt(0)>m.getLastName().charAt(0)) {
//			
//			return 1;
//		}
//		else if(this.lastName.charAt(0)<m.getLastName().charAt(0)) {
//			
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
		return this.lastName.compareTo(m.lastName);
		
		// This is for compilation. You need to change it.
	}

	// Constructor
	public Student(String fn, String ln, String major, double gpa) {
		this.firstName = fn;
		this.lastName = ln;
		this.major = major;
		this.gpa = gpa;
	}

	// Getter methods for accessing private data
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMajor() {
		return major;
	}

	public double getGPA() {
		return gpa;
	}
	
	@Override
	public String toString(){
		return this.lastName + " " + this.firstName + " " + this.major + " " + this.gpa;
	}
}

// Finish implementing the following class, so that students can be sorted by
// their first name

 class FirstNameCompare implements Comparator<Student> {


	 public int compare(Student m1, Student m2) {
		 return (1)*m1.getFirstName().compareTo(m2.getFirstName());
	 }
	 
 }

// Finish implementing the following class, so that students can be sorted by
// their major

 class MajorCompare implements Comparator<Student>{
	 
	 public int compare(Student m1, Student m2) {
		 return m1.getMajor().compareTo(m2.getMajor());
	 }
 }

// Finish implementing the following class, so that students can be sorted by
// their GPA in descending order
 class GPACompare implements Comparator<Student> {
// YOUR CODES
	 
	 public int compare(Student m1, Student m2) {
		 
		 return (-1)*Double.compare(m1.getGPA(), m2.getGPA());
		 
	 }
 }
 
 

public class StudentSort {
	public ArrayList<Student> sortByFirstName(ArrayList<Student> list) {
		// YOUR CODES
		
		Collections.sort(list, new FirstNameCompare());
		
		
		return list; // for compilation. You need to change it.
	}

	public ArrayList<Student> sortByLastName(ArrayList<Student> list) {
		// YOUR CODES
		
		Collections.sort(list);

		
		
		return list; // for compilation. You need to change it.
	}

	
	
	public ArrayList<Student> sortByMajor(ArrayList<Student> list) {
		// YOUR CODES
		
		
		Collections.sort(list, new MajorCompare());
		
		return list; // for compilation. You need to change it.
	}
	
	

	public ArrayList<Student> sortByGPA(ArrayList<Student> list) {
		// YOUR CODES
		
		Collections.sort(list, new GPACompare());
		
		
		return list; // for compilation. You need to change it.
	}
	
	
	
	
	public void display(ArrayList<Student> theList) {
		for (Student st: theList) {
			System.out.println(st.toString());
		}
	}

	public static void main(String[] args) {
		StudentSort ss = new StudentSort();

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Ellen", "Smith", "cs", 3.78));
		list.add(new Student("Ava", "Johnson", "math", 3.92));
		list.add(new Student("Mia", "Williams", "cs", 3.66));
		list.add(new Student("Sophie", "Brown", "math", 3.72));
		list.add(new Student("Nele", "Davis", "cs", 3.88));

		ArrayList<Student> sortedS1 = ss.sortByFirstName(list);
		System.out.println("Sorted by First Name");
		ss.display(sortedS1);
		System.out.println();
		ArrayList<Student> sortedS2 = ss.sortByLastName(list);
		System.out.println("Sorted by Last Name");
		ss.display(sortedS2);
		System.out.println();

		ArrayList<Student> sortedS3 = ss.sortByMajor(list);
		System.out.println("Sorted by Major");
		ss.display(sortedS3);
		System.out.println();

		ArrayList<Student> sortedS4 = ss.sortByGPA(list);
		System.out.println("Sorted by GPA");
		ss.display(sortedS4);
		System.out.println();

	}
}
