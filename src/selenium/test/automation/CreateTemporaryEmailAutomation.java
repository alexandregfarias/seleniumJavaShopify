package selenium.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTemporaryEmailAutomation {

	public static String createNewTemporaryEmail(WebDriver driver) throws InterruptedException {
		driver.get("https://temp-mail.org/pt/");
		Thread.sleep(8000);
		WebElement emailInput = driver.findElement(By.id("mail"));
		String generatedEmail = emailInput.getAttribute("value");
		return generatedEmail;
	}

}