package button_element_actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Click_me_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// System.setProperty("webdriver.chrome.driver"
		// "D:\\Selenium
		// code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		// Thread.sleep(1000);
		// Actions action=new Actions(driver);
		// action.click(driver.findElement(By.id("bDxEr"))).build().perform();
		// driver.findElement(By.id("dynamicClickMessage")).isDisplayed();
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).isDisplayed();

	}

}
