package uploadTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GenderTesting {
	@Test(description = "GenderTesting for practiceform")
	public static void GenderTesting() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/automation-practice-form");

		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement checkBox = driver.findElement(By.xpath("//label[text()='Male']//preceding-sibling::input"));

		j.executeScript("arguments[0].scrollIntoView(true);", checkBox);
		driver.findElement(By.xpath("//label[text()='Male']//preceding-sibling::input")).click();

	}

}
