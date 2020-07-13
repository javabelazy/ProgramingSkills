/**
 * 
 */
/**
 * input ab2c3
 * output ababcababcababc
 */
package com.codecreeks.solutions;

/**
 * @author Consumerfed
 *
 */
public class StringManipBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();

		StringManipBuffer stringManip = new StringManipBuffer();
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
		StringBuffer sb = new StringBuffer();
		char[] charInput = input.toCharArray();
		for (Character ch : charInput) {
			if (ch.isDigit(ch)) {
				String str = loop(sb.toString(), (int) ch - 48);
				sb.delete(0,sb.length());
				sb.append(str);
			} else {
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
