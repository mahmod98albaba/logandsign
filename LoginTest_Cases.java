package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest_Cases extends Parameters {

	WebDriver driver = new ChromeDriver();

	Parameters myObject = new Parameters();

	@BeforeTest
	public void myBeforeTest() {

		driver.get(myUrl);
	}
	
	@Test
	public void myTest() {
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		WebElement emailSignIn = driver.findElement(By.id("email"));
		WebElement passSignIn = driver.findElement(By.id("pass"));

		emailSignIn.sendKeys(email);
		passSignIn.sendKeys(pasS);
		driver.findElement(By.id("send2")).click();

		
		
	}

	

	@AfterTest
	public void myAfterTest() {
	}

}