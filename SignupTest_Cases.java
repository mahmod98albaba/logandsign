package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTest_Cases extends Parameters {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void myBeforeTest() {
		driver.get(myUrl);
	}

	@Test
	public void myTest() {
		driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();

		WebElement userNameInput = driver.findElement(By.id("firstname"));
		WebElement lastWordInput = driver.findElement(By.id("lastname"));
		WebElement emailInput = driver.findElement(By.id("email_address"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement passwordConfrmInput = driver.findElement(By.id("password-confirmation"));


		emailInput.sendKeys(email);
		userNameInput.sendKeys(randomFirstName);
		lastWordInput.sendKeys(randomLastName);
		passwordInput.sendKeys(pasS);

		passwordConfrmInput.sendKeys(pasS);
		driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();

	}

	@AfterTest
	public void myAfterTest() {
	}
}