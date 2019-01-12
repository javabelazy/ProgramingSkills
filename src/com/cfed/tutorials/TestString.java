package com.cfed.tutorials;

import java.io.UnsupportedEncodingException;

public class TestString {
    public static void main(String[] args) throws UnsupportedEncodingException {
    	
    	String s = new String("B");
    	 byte[] b = s.getBytes("UTF-8");
    	 for (int i = 0; i < b.length; i++) { 
             System.out.print(b[i]); 
         } 
    }
}