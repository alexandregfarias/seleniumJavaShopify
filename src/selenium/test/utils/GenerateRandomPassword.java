package selenium.test.utils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class GenerateRandomPassword {

	public static String generatePassword() {
		SecureRandom random = new SecureRandom();
		String numbers = "0123456789";
		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "#@!$%&";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			sb.append(numbers.charAt(random.nextInt(numbers.length())));
		}

		sb.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));

		sb.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));

		sb.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

		String finalString = sb.toString();
		return shuffleString(finalString);
	}

	private static String shuffleString(String input) {
		List<Character> characters = new ArrayList<>();
		for (char c : input.toCharArray()) {
			characters.add(c);
		}
		StringBuilder output = new StringBuilder(input.length());
		while (characters.size() > 0) {
			int randPicker = (int) (Math.random() * characters.size());
			output.append(characters.remove(randPicker));
		}
		return output.toString();
	}

}