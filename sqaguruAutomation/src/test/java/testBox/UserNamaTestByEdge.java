package testBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UserNamaTestByEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HII");
		System.setProperty("webdriver.edge.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("banti");
		System.out.println("HLO");
	}

}
