package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
	@DataProvider(name="GoogleDataProvider")
	
	public Object[][] createData1() {
		 return new Object[][] {
		   { "Chrome", "email" },
		   { "edge", "testng.org"},
		   {"firefox" ,"java oops"},
		 };
		}
	@Test(dataProvider="GoogleDataProvider")
	public void ParameterTest(String browserName ,String SearchKey) {

		EmailTest driver1 = new EmailTest();

		WebDriver driver = driver1.launchBrowser(browserName);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userEmail")).sendKeys("bantinayak888@gmail.com");

	}
	@Test(dataProvider="GoogleDataProvider")
   public void test2(String browserName ,String SearchKey)
   {
		Reporter.log(browserName , true);
		Reporter.log(SearchKey , true);
		
   }

}
