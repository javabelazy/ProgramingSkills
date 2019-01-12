package com.cfed.tutorials;
/**
 *  creating an immutable class - class which state does not change
 *  
 *  helps for caching, thread safe etc
 *  
 *  class is final
 *  
 *  all mutable fields are changed to final
 *  
 *  no setters
 *  
 */
import java.util.HashMap;
import java.util.Iterator;

public final class MedicalRepresentives {

	private final int tin;
	
	private final String companyName;
	
	private final HashMap<String,String> employees;
	
	public int getId() {
		return tin;
	}


	public String getName() {
		return companyName;
	}

	/**
	 * Accessor function for mutable objects
	 */
	public HashMap<String, String> getTestMap() {
		//return testMap;
		return (HashMap<String, String>) employees.clone();
	}


	public MedicalRepresentives(int i, String n, HashMap<String,String> hm){
		
		this.tin=i;
		this.companyName=n;
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, hm.get(key));
		}
		this.employees=tempMap;
	}
	
	
	/**
	 * Constructor performing Shallow Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
	/**
	public FinalClassExample(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.testMap=hm;
	}
	*/
	
	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "Biju Vas");
		h1.put("2", "Smithesh");
		h1.put("3", "Sreekumar");
		
		String s = "Guru Medicals , Vadakara";
		
		int i=19999999;
		
		MedicalRepresentives ce = new MedicalRepresentives(i,s,h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==ce.getName());
		System.out.println(h1 == ce.getTestMap());
		//print the ce values
		System.out.println(" Tin number:"+ce.getId());
		System.out.println("organisation name :"+ce.getName());
		System.out.println("employees :"+ce.getTestMap());
		//change the local variable values
		i=20;
		s="New organisation";
		h1.put("4", "Manohar");
		//print the values again
		System.out.println("tin after local variable change:"+ce.getId());
		System.out.println("organistion name after local variable change:"+ce.getName());
		System.out.println("employess after local variable change:"+ce.getTestMap());
		
		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());

	}

}