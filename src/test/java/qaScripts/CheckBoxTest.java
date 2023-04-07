package qaScripts;
import org.testng.annotations.Test;

import pageObjects.CheckBoxesPageObject;

import org.openqa.selenium.WebDriver;


import util.base;

public class CheckBoxTest {

	base base_instance;
	WebDriver driver1;
	CheckBoxesPageObject cbpo;
	
	public CheckBoxTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test checks and unchecks checkboxes.\r\n"
			+ "Test uses assertions to make sure boxes were properly checked and unchecked.")
	public void TestCheckboxes()
	{
		cbpo=base_instance.ob_cl.checkBoxes_PageObjects();
		cbpo.ClickCheckbox();
		cbpo.ChooseCheckboxes();	
	}
}
