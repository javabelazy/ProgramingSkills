package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * We distribute some number of candies, to a row of n = num_people people in the following way:

We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.

Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.

This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).

Return an array (of length num_people and sum candies) that represents the final distribution of candies.Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * @author Apple
 *
 */

class Solution16 {
	   public int[] distributeCandies(int candies, int num_people) {
	        
	        int [] people = new int[num_people];
	        int count =1;
	        int position = 0;    
	            while(count <=candies){
	                if(position == num_people)
	                    position = 0;
	                if(count > num_people)    
	                people[position] = count+ people[position];
	                else
	                people[position] = count;
	                candies = candies - count;
	                count++;
	               position++;
	            }
	            
	         if(candies>0) {
	        	 if(position == num_people)
	                    position = 0;
	        	 if(count > num_people)    
		                people[position] = candies+ people[position];
		                else
		                people[position] = candies;
	         }   
	            
	        return people;
	    }

	public static void main(String[] args) {
		Solution16 s = new Solution16();
		System.out.println(s.distributeCandies(7,4));
		
	}
}