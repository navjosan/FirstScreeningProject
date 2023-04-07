package util;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class switchToWindows {
	
	WebDriver driver;
	
	public switchToWindows(WebDriver driver) {
		this.driver=driver;
	}

	public void windows_switch_method()
	{
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String parent_id = it.next();
	String child_id = it.next();
	driver.switchTo().window(child_id);
	}


}
