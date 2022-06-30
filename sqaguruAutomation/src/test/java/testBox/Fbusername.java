package testBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbusername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9861986899");
		// driver.findElement(By.cssSelector("input[name='email'][id='email']")).sendKeys("9861986899");
		// driver.findElement(By.cssSelector("form > div >div >
		// input")).sendKeys("9861986899");
		driver.findElement(By.cssSelector("form#u_0_e_Z4 input#email")).sendKeys("9861986899");

		// driver.findElement(By.cssSelector("form > div >div >div>
		// input")).sendKeys("9861986899");

	}

}
