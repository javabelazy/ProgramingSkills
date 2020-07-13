package com.traxcn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solution {

	public static void main(String args[]) {

		String[] ingre = { "FATOil", "FIBERSpinach", "CARBRice", " FATCheese", "FIBERBeans" };
		Map<Integer, String> ingred = new HashMap<Integer, String>();
		ingred.put(1, "FATOil");
		ingred.put(2, "FIBERSpinach");
		ingred.put(3, "CARBRice");
		ingred.put(4, "FATCheese");
		ingred.put(5, "FIBERBeans");
		ingred.put(6, "FATEgg");
		ingred.put(7, "FIBERBrocoli");
		ingred.put(8, "CARBPotato");
		ingred.put(9, "CARBCorn");
		ingred.put(10, "FATOlive");
		ingred.put(11, "FIBERCarrot");
		ingred.put(12, "CARBBeetroot");
		
		

		int days = 6;
		findChefCookingDays(days, ingred);

	}

	List<String> categories = List.of("FAT", "FIBER", "CARB");
	static int fatCount = 0;
	static int fiberCount = 0;
	static int CarbCount = 0;

	static List<String> fatList = new ArrayList<>();
	static List<String> fiberList = new ArrayList<>();
	static List<String> CarbList = new ArrayList<>();

	private static void findChefCookingDays(int days, Map<Integer, String> ingred) {

		for (Entry<Integer, String> entry : ingred.entrySet()) {

			if (entry.getValue().contains("FAT")) {
				fatList.add(entry.getValue());
				fatCount++;
			} else if (entry.getValue().contains("FIBER")) {
				fiberList.add(entry.getValue());
				fiberCount++;
			} else if (entry.getValue().contains("CARB")) {
				CarbList.add(entry.getValue());
				CarbCount++;
			}

			int isCook = tryToCook(ingred);
			System.out.print(isCook);

		}

		/*
		 * for (String ing : ingred) { tryToCook(); if (ing.contains("FAT")) {
		 * fatCount++; } else if (ing.contains("FIBER")) { fiberCount++; } else if
		 * (ing.contains("CARB")) { CarbCount++; }
		 * 
		 * }
		 */

	}

	private static int tryToCook(Map<Integer, String> ingred) {

		if (fatList.size() > 2 || (fatList.size() >= 2 && (fiberList.size() > 0 || CarbList.size() > 0))) {
			if (CarbList.size() > 0) {
				CarbList.remove(0);
			}else if (fiberList.size() > 0) {
				fiberList.remove(0);
			} else if (fatList.size() > 2) {
				fatList.remove(0);
			}
			fatList.remove(0);
			fatList.remove(0);

			return 1;

		} else if (fiberList.size() >2 ||( fiberList.size() >= 2 && (fatList.size() > 0 || CarbList.size() > 0))) {

			if (fatList.size() > 0) {
				fatList.remove(0);
			} else if (CarbList.size() > 0) {
				CarbList.remove(0);
			} else if (fiberList.size() > 2) {
				fiberList.remove(0);
			}
			fiberList.remove(0);
			fiberList.remove(0);

			return 1;

		} else if (CarbList.size() > 2 || (CarbList.size() >= 2 && (fatList.size() > 0 || fiberList.size() > 0))) {

			if (fatList.size() > 0) {
				fatList.remove(0);
			} else if (fiberList.size() > 0) {
				fiberList.remove(0);
			} else if (CarbList.size() > 2) {
				CarbList.remove(0);
			}
			CarbList.remove(0);
			CarbList.remove(0);
			return 1;
		} else {

			return 0;
		}

	}

}
