package qaScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DynamicControlsPageObject;
import util.base;

public class DynamicControlsTest {

	WebDriver driver;
	DynamicControlsPageObject dcpo;
	base base_instance;
	String text;
	
	DynamicControlsTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	
	@Test(priority=1,description="Test clicks on the Remove Button and uses explicit wait.")
	public void Click_Dynamic_Content()
	{
		dcpo=base_instance.ob_cl.dynamicControls_PageObject();
		dcpo.ClickDynamicContent();
		dcpo.ClickButton();
		dcpo.ExplicitWaitForMessage();
		text=dcpo.GetMessage();
		Assert.assertEquals(text,"It's gone!");
	}
	
	@Test(priority=2,description="est asserts that the checkbox is gone.")
	public void Check_CheckBox_Gone()
	{
		dcpo.ClickDynamicContent();
		dcpo.ClickButton();
		dcpo.ExplicitWaitForMessage();
		dcpo.CheckBoxGone();
		text=dcpo.GetMessage();
		Assert.assertEquals(text,"It's gone!");
	}
	
	@Test(dependsOnMethods= {"Click_Dynamic_Content","Check_CheckBox_Gone"},description="Test clicks on Add Button and uses explicit wait.\r\n"
			+ "Test asserts that the checkbox is present.")
	public void Click_AddButton()
	{
		dcpo.ClickDynamicContent();
		dcpo.ClickButton();
		dcpo.ExplicitWaitForMessage();
		dcpo.CheckBoxBack();
		text=dcpo.GetMessage();
		Assert.assertEquals(text,"It's back!");
	}
	
	@Test(description="Test clicks on the Enable Button and uses explicit wait.Test asserts that the text box is enabled.")
	public void Click_EnableButton()
	{
		dcpo.ClickDynamicContent();
		dcpo.ClickButton();
		dcpo.ExplicitWaitForMessage();
		dcpo.TextBoxEnable();
		text=dcpo.GetMessage();
		Assert.assertEquals(text,"It's enabled!");
	}
	
	@Test(dependsOnMethods= {"Click_EnableButton"},description="Test clicks on the Disable Button and uses explicit wait.\r\n"
			+ "Test asserts that the text box is disabled.")
	public void Click_DisableButton()
	{
		dcpo.ClickButton();
		dcpo.ExplicitWaitForMessage();
		dcpo.TextBoxDisable();
		text=dcpo.GetMessage();
		Assert.assertEquals(text,"It's disabled!");
	}
}
