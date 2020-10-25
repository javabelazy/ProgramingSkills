package com.cfed.commentUtils;
/**
 * 
 */
import java.util.Random;
/**
 * 
 * @author Kzn
 *
 */
public class OTPGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OTPGenerator p = new OTPGenerator();

		int i = 0;
		while (i < 1000) {
			System.out.println(p.genrateOTP());
			i++;
		}

	}

	private int genrateOTP() {
		Random r = new Random();
		int value = 10000 + r.nextInt(90000);

		/*if (value < 100000) {
			System.out.println(" calling again");
			genrateOTP();
		}*/
		return value;
	}

}
