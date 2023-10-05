package introduction;

import java.util.Random;

public class Parameters {
	String myUrl = "https://magento.softwaretestingboard.com/";
	static String pasS = "Anas1995!";
	static String[] firstNames = generateRandomNames(1); // Change 10 to the desired number of random first names
	static String[] lastNames = generateRandomNames(1); // Change 10 to the desired number of random last names
	static String randomFirstName = firstNames[0];
	static String randomLastName = lastNames[0];
	static String email = randomFirstName.toLowerCase() + randomLastName.toLowerCase() + "@gmail.com";

	public static String[] generateRandomNames(int numberOfNames) {
		String[] names = new String[numberOfNames];
		Random random = new Random();

		String[] randomNames = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Henry", "Ivy", "Jack" };

		for (int i = 0; i < numberOfNames; i++) {
			int randomIndex = random.nextInt(randomNames.length);
			names[i] = randomNames[randomIndex];
		}

		return names;
	}

	public static String[] getEmailAddresses(int numberOfEmails) {
		String[] emailAddresses = new String[numberOfEmails];

		for (int i = 0; i < numberOfEmails; i++) {
			String randomFirstName = firstNames[new Random().nextInt(firstNames.length)];
			String randomLastName = lastNames[new Random().nextInt(lastNames.length)];
			emailAddresses[i] = randomFirstName.toLowerCase() + randomLastName.toLowerCase() + "@gmail.com";
		}

		return emailAddresses;
	}
}