package commonlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class SeleniumUtils {

	public void captureScreenshot(WebDriver driver, String filename) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Selenium code\\selenium_testing\\resource\\Results\\" + filename + ".png");
		Files.copy(srcFile, destfile);

	}

}
