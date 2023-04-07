package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DropDownPageObject;
import util.base;

public class DropDownTest {

	base base_instance;
	DropDownPageObject drop;
	String text="Option 1";
	
	DropDownTest(base base_instance){
		this.base_instance=base_instance;
	}
	
	@Test(description="Test selects Option 1 and Option 2 from the drop down menu.\r\n"
			+ "Test asserts Option 1 and Option 2 are selected.")
	public void DropDownMenu() {
		
		drop=base_instance.ob_cl.dropDown_PageObjects();
		String match_text=drop.DropDown();
		Assert.assertEquals(text, match_text);
	}
}
