package qaScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContextMenuPageObject;
import util.base;

public class ContextMenuTest {

	base base_instance;
	WebDriver driver;
	ContextMenuPageObject cmpo;
	String message="You selected a context menu";
	
	ContextMenuTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test right clicks on the context menu.\r\n"
			+ "Test asserts the alert menu text.")
	public void ContextMenu()
	{
		cmpo=base_instance.ob_cl.contextMenu_PageObjects();
		cmpo.Right_Click();
		String alert_message=cmpo.AcceptingAndGrabbingTextOfAlert();
		Assert.assertEquals(message, alert_message);
	}
}
