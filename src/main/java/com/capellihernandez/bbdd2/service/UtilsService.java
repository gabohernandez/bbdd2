package com.capellihernandez.bbdd2.service;

import java.util.Random;

public class UtilsService {

	// create a string of all characters
	private static final String STRING_CHART = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	// specify length of random string
	private static final int LENGTH = 7;

	public static String randomString() {
		// Lo saqué de acá:
		// https://www.programiz.com/java-programming/examples/generate-random-string
		// create random string builder
		StringBuilder sb = new StringBuilder();
		// create an object of Random class
		Random random = new Random();
		for (int i = 0; i < LENGTH; i++) {
			// generate random index number
			int index = random.nextInt(STRING_CHART.length());
			// get character specified by index
			// from the string
			char randomChar = STRING_CHART.charAt(index);
			// append the character to string builder
			sb.append(randomChar);
			// Lo saqué de acá: https://www.baeldung.com/java-random-string
		}
		return sb.toString();
	}

}
