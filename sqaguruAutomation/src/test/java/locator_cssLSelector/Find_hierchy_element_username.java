package locator_cssLSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_hierchy_element_username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/text-box");

		driver.findElement(By.cssSelector("form#userForm>div:nth-of-type(1)>div>input")).sendKeys("banti888@");
		// driver.findElement(By.cssSelector("form#userForm
		// input#userName")).click();//sendKeys("banti888@");
	}

}
