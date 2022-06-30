package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestNgParameterTest {
	@Parameters("browserName")
	@Test
	public void ParameterTest(String browserName) {

		EmailTest driver1 = new EmailTest();

		WebDriver driver = driver1.launchBrowser(browserName);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userEmail")).sendKeys("bantinayak888@gmail.com");
		


	}
}
