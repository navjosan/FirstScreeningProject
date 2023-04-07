package qaScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DynamicLoadingPageObjects;
import util.base;

public class DynamicLoadingTest {

	WebDriver driver;
	DynamicLoadingPageObjects dlpo;
	base base_instance;
	String text;
	
	DynamicLoadingTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test clicks the start button and uses explicit wait.\r\n"
			+ "Test asserts that “Hello World!” text is displayed.")
	public void Test_Dynamic_Loading()
	{
		dlpo=base_instance.ob_cl.dynamicLoading_PageObjects();
		dlpo.ClickDynamicLoading();
		dlpo.ClickExample();
		dlpo.ClickStart();
		dlpo.ExplicitWaitForMessage();
		String text=dlpo.GetMessage();
		Assert.assertEquals(text,"Hello World!");
	}
}
