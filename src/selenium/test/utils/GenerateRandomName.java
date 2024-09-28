package selenium.test.utils;

import java.util.Random;

public class GenerateRandomName {

	private static final String[] names = {
			"Bruce", "Carlos", "Bea", "John", "William", "Mariana", "Lucas", "Raphael", 
			"Donatelo", "Michelangelo", "Bill", "Elon", "Diego", "Ramon", "Mateus", 
			"Zick", "Jade", "Zofi", "Steve", "Lara"
	};

	private static final String[] lastNames = {
			"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", 
			"Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", 
			"Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin"
	};

	public static String generateRandomName() {
		Random random = new Random();
		int i = random.nextInt(names.length);
		return names[i];
	}

	public static String generateRandomLastName() {
		Random random = new Random();
		int i = random.nextInt(lastNames.length);
		return lastNames[i];
	}

}