package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_class {

	WebDriver driver;

	public WebDriver initialize() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\field_value.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String property_browser=prop.getProperty("browser");
		String maven_browser=System.getProperty("browser");
		
		String browser=(maven_browser!=(null)) ? maven_browser : property_browser;
		String url=prop.getProperty("url");
		
		if (driver == null) {
			if(browser.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kaurn\\eclipse-workspace\\QaAutomationTest\\src\\test\\resources\\chromedriver_win32 (4)\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			driver.get(url);
		}
		return driver;
	}

}
