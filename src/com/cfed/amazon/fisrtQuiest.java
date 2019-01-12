package com.cfed.amazon;
import java.util.ArrayList;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class fisrtQuiest
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants, 
                                         List<List<Integer>> allLocations, 
                                         int numRestaurants)
	{
        // WRITE YOUR CODE HERE
        
        Map<Double,List> locationMap = new TreeMap<>();
        
        for(List<Integer> location : allLocations){
            double value = location.get(0)*location.get(0)+location.get(1)*location.get(1);
            locationMap.put(value, location);
        }
        
        int i =0;
        
        List<List<Integer>> nearbyLocationList = new ArrayList<>();
        
        for(Entry<Double, List> entry : locationMap.entrySet()) {
        	
        	if(i<numRestaurants) {
        		
        		nearbyLocationList.add(entry.getValue());
        		i++;
        	}
        }
        
		return nearbyLocationList;
        
    }
    // METHOD SIGNATURE ENDS
    
    
    public static void main(String[] args) {
		
    	int totalRest = 3;
    	
    	fisrtQuiest s = new fisrtQuiest();
    	
    /*	List<List<Integer>> allLocations = new ArrayList<>();
    	List<Integer> list1 = new ArrayList<>();
    	list1.add(1);
    	list1.add(-3);
		allLocations.add(list1);
		List<Integer> list2 = new ArrayList<>();
    	list2.add(1);
    	list2.add(2);
		allLocations.add(list2);
		List<Integer> list3 = new ArrayList<>();
    	list3.add(3);
    	list3.add(4);
		allLocations.add(list3);*/
    	
    	
    	
        	List<List<Integer>> allLocations = new ArrayList<>();
    	List<Integer> list1 = new ArrayList<>();
    	list1.add(3);
    	list1.add(6);
		allLocations.add(list1);
		List<Integer> list2 = new ArrayList<>();
    	list2.add(2);
    	list2.add(4);
		allLocations.add(list2);
		List<Integer> list3 = new ArrayList<>();
    	list3.add(5);
    	list3.add(3);
		allLocations.add(list3);
		
		List<Integer> list4 = new ArrayList<>();
    	list4.add(2);
    	list4.add(7);
		allLocations.add(list4);
    	
		List<Integer> list5 = new ArrayList<>();
    	list5.add(1);
    	list5.add(8);
		allLocations.add(list5);
		
		List<Integer> list6 = new ArrayList<>();
    	list6.add(7);
    	list6.add(9);
		allLocations.add(list6);
    	
    	
		//s.nearestVegetarianRestaurant(3, allLocations, 2);
		System.out.println(s.nearestVegetarianRestaurant(6, allLocations, 3));
    	
	}
    
    
}