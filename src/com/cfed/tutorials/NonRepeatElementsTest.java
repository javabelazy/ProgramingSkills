/**
 * 
 */
package com.cfed.tutorials;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Ranjini Raj
 *
 */
public class NonRepeatElementsTest {

	  @Test
	    public void multiplicationOfZeroIntegersShouldReturnZero() {
	        
	        NonRepeatedElements tester = new NonRepeatedElements();

	        // assert statements
	        assertEquals('o', tester.findNonRepeatElement("hello", 3));
	        assertEquals('d', tester.findNonRepeatElement("aabbccd", 1));
	    }

}
