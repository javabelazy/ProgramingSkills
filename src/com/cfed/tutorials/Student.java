/**
 * Static variable in java
 * 
 * Since JDK 1.7, it is not possible to execute a java class without the main method.
 */
package com.cfed.tutorials;

/**
 * @author consumerfed
 *
 */
public class Student {
	
	int rollNo =0;
	String studentName;
	static int counter = 0;
	int count=0;
	
	

	public Student(int rollNo, String studentName){
		this.rollNo = rollNo;
		this.studentName = studentName;
		counter ++;
		count++;
	}
	
	/**
	 * The static method can not use non static data member or call non-static method directly.
	 * 
	 * this and super cannot be used in static context.
	 * 
	 */
//	public static void display() {
//		System.out.println(" roll No :"+rollNo);
//		print();
//	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "sachin");
		Student s2 = new Student(2, "dravid");
		Student s3 = new Student(3, "saurav");
		s3.print();
//		Student.display();
		
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" counter : "+counter);
		System.out.println(" count : " + count);
		
	}

}
