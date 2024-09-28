package selenium.test.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.test.utils.GenerateRandomName;
import selenium.test.utils.GenerateRandomPassword;

public class CreateShopifyAccountAutomation {
	// I'm still going to simplify this method and organize it better
	public static void CreateNewShopifyAccount() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String email = CreateTemporaryEmailAutomation.createNewTemporaryEmail(driver);
		System.out.println("Temporary E-mail Successfully created:");
		System.out.println(email);
		System.out.println();

		String name = GenerateRandomName.generateRandomName();
		System.out.println("Random Name created:");
		System.out.println(name);

		String lastName = GenerateRandomName.generateRandomLastName();
		System.out.println("Last name created:");
		System.out.println(lastName);

		String password = GenerateRandomPassword.generatePassword();
		System.out.println("Password created:");
		System.out.println(password);

		driver.get("https://accounts.shopify.com/signup?rid=7faee4cc-73af-40d9-b63c-3c132668caea&signup_strategy=password");

		WebElement emailField = driver.findElement(By.id("account_email"));
		emailField.sendKeys(email);

		WebElement firstNameField = driver.findElement(By.id("account_first_name"));
		firstNameField.sendKeys(name);

		WebElement lastNameField = driver.findElement(By.id("account_last_name"));
		lastNameField.sendKeys(lastName);

		WebElement passwordField = driver.findElement(By.id("account_password"));
		passwordField.sendKeys(password);

		WebElement confirmPasswordField = driver.findElement(By.id("password-confirmation"));
		confirmPasswordField.sendKeys(password);
		Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("commit")));
		submitButton.click();

		Thread.sleep(5000);

		driver.quit();

	}

}