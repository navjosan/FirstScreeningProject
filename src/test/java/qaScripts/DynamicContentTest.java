package qaScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.DynamicContentPageObject;
import util.base;

public class DynamicContentTest {

	WebDriver driver;
	DynamicContentPageObject dcpo;
	base base_instance;
	DynamicContentTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test refreshes the page a couple of times.\r\n"
			+ "Test asserts that the content changes on each refresh.")
	public void LoadDynamicContent()
	{
		dcpo=base_instance.ob_cl.dynamicContent_PageObject();
		dcpo.ClickDynamicContent();
		dcpo.RefreshPage(5);
	}
}
