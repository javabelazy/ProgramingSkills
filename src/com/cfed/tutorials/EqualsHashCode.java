/**
 * 
 */
package com.cfed.tutorials;

import java.util.HashSet;

import com.cfed.model.Student;

/**
 * @author cfed
 *
 */
public class EqualsHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student cfed1 = new Student(1, "Consumerfed");
		Student cfed2 = new Student(1, "Consumerfed");
		System.out.println(" hashcode for cfed1 : "+cfed1.hashCode() +" cfed2 "+cfed2.hashCode());
		System.out.println(cfed1.equals(cfed2));
		
		HashSet<Student> studentHashSet = new HashSet<>();
		studentHashSet.add(cfed1);
		studentHashSet.add(cfed2);
		
		System.out.println(studentHashSet.contains(new Student(1, "Consumerfed")));

	}

}
