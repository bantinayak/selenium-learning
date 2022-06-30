package web_element_switch_command_dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import commonlib.SeleniumUtils;

public class OldStyleSelectMenu {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String Projectdirectory = System.getProperty("user.dir");
		System.out.println(Projectdirectory);
		
		WebDriver driver;
		String browserName="edge";
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",
					"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		else{
			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		driver.get("https://demoqa.com/select-menu");

		SeleniumUtils seleniumUtils = new SeleniumUtils();

		seleniumUtils.captureScreenshot(driver, "1_navigatetoDemoQaMenu");
		
		 File srcFILE = driver.findElement(By.id("oldSelectMenu")).getScreenshotAs(OutputType.FILE);
		 File destFile = new File("D:\\Selenium code\\selenium_testing\\resource\\Results\\screen1.png");
		 Files.copy(srcFILE, destFile);// a particular element capture snapshot
		
	//	seleniumUtils.captureElementScreenshotFor(driver,"1_SelectDropDownColour");

		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByVisibleText("Yellow");
		seleniumUtils.captureScreenshot(driver, "2_navigatetoYellow");
		Thread.sleep(3000);
		select.selectByIndex(2);
		seleniumUtils.captureScreenshot(driver, "3_navigatetoIndex");
		Thread.sleep(3000);
		select.selectByValue("6");
		seleniumUtils.captureScreenshot(driver, "4_navigateto6");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[.='Mrs']")).click();
		driver.findElement(By.xpath("//*[.='Mrs']")).click();
		System.out.println("hi");

	}

}
