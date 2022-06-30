package testNg;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import frameWork.Base;

public class UserNameTest extends Base {
	

	@Test(description = "To verify 'username' Test on qatool", priority = 3, groups = "Group-1") // Testing test case annotation
	public void UserNameTest() {
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("amit");
		Reporter.log("hlo");

	}

	@Test(description = "To verify 'Email' Test on qatool", priority = 2)
	public void EmailTest() {

		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userEmail")).sendKeys("bantinayak888@gmail.com");

	}

	@Test(description = "To verify google search for keyword'Selenium Dev'",priority=1)
	public void GoogleSearchbarTest() {
		// TODO Auto-generated method stub
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).isDisplayed();// verify search bar exist
		driver.findElement(By.name("q")).sendKeys("selenium dev");// type text on search bar
		driver.equals("selenium dev-Google Search");
		Assert.assertEquals(driver, "selenium dev", "selenium dev-Google Search");
		String titlebeforesubmit = driver.getTitle();
		driver.findElement(By.name("q")).submit();
		String titleaftersubmit = driver.getTitle();
		if (titlebeforesubmit.equals(titleaftersubmit)) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}
}
