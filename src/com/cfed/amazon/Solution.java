package com.cfed.amazon;
import java.util.ArrayList;
import java.util.List;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> optimalUtilization(
	                        int deviceCapacity, 
                            List<List<Integer>> foregroundAppList,
                            List<List<Integer>> backgroundAppList)
	{
		
        // WRITE YOUR CODE HERE
    	
    	List<List<Integer>> optimalUtilization = new ArrayList<>(2);
    	
        for(List<Integer> fgList : foregroundAppList){
            for(List<Integer> bgList : backgroundAppList){
            	
            	int value = fgList.get(1)+bgList.get(1);
            	
            	
            	
            	if(value==deviceCapacity ) {
            	
            	List optList = new ArrayList<>();
            	optList.add(fgList.get(0));
            	optList.add(bgList.get(0));
            	optimalUtilization.add(optList);
            	}
            	
            }
        }
    	
    	return optimalUtilization;
    }
    // METHOD SIGNATURE ENDS
    
    
    public static void main(String[] args) {
		
    	
    	Solution s = new Solution();
    	
    	List<List<Integer>> fb = new ArrayList<>();
	List<Integer> list1 = new ArrayList<>();
	list1.add(1);
	list1.add(8);
	fb.add(list1);
	List<Integer> list2 = new ArrayList<>();
	list2.add(2);
	list2.add(15);
	fb.add(list2);
	List<Integer> list3 = new ArrayList<>();
	list3.add(3);
	list3.add(9);
	fb.add(list3);
	
	
	List<List<Integer>> bg = new ArrayList<>();
	
	List<Integer> list4 = new ArrayList<>();
	list4.add(1);
	list4.add(8);
	bg.add(list4);
	
	List<Integer> list5 = new ArrayList<>();
	list5.add(2);
	list5.add(11);
	bg.add(list5);
	
	List<Integer> list6 = new ArrayList<>();
	list6.add(3);
	list6.add(12);
	bg.add(list6);
	
	
	//s.nearestVegetarianRestaurant(3, allLocations, 2);
	System.out.println(s.optimalUtilization(20, fb, bg));
    	
	}
}