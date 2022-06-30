package testNg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonlib.ExcelTest;

public class TestNgDataProviderUsingExcel {

@DataProvider(name="GoogleDataProvider")
	
	public Object[] createData1() throws FileNotFoundException, IOException {
		return (Object[]) ExcelTest.readExcelData();
		}
	@Test(dataProvider="GoogleDataProvider")
	public void ParameterTest(HashMap<String,String> testData) {

		EmailTest driver1 = new EmailTest();

		WebDriver driver = driver1.launchBrowser(testData.get(driver1));

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userEmail")).sendKeys("bantinayak888@gmail.com");

	}
	//@Test(dataProvider="GoogleDataProvider")
   public void test2(String browserName ,String SearchKey)
   {
		Reporter.log(browserName , true);
		Reporter.log(SearchKey , true);
		

	}

}
