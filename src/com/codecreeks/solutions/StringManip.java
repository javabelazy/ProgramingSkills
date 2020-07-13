/**
 * input ab2c3
 * output ababcababcababc
 */
package com.codecreeks.solutions;

/**
 * @author Konzerntech
 *
 */
public class StringManip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		StringManip stringManip = new StringManip();
		String output = stringManip.compute("ab2c2");
		System.out.println(output);
		Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is KB: " + memory/1024);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(" Time Taken :"+elapsedTime);
	}

	private String compute(String input) {
		StringBuilder sb = null;
		char[] charInput = input.toCharArray();
		for (Character ch : charInput) {
			if (ch.isDigit(ch)) {
				String str = loop(sb.toString(), (int) ch - 48);
				sb = new StringBuilder(str);
			} else {
				if (null == sb) {
					sb = new StringBuilder();
				} 
					sb.append(ch);
			}
		}

		return sb.toString();
	}

	private String loop(String str, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

}
