package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MultipleWindowsPageObjects;
import util.base;

public class MultipleWindowsTest {

	base base_instance;
	MultipleWindowsPageObjects mwpo;
	String new_tab_title, title;
	
	public MultipleWindowsTest(base base_instance) {
		this.base_instance=base_instance;
	}
	
	@Test(description="Test clicks on the Click Here link.Test asserts that a new tab is opened with text New Window.")
	public void TestMultipleWindows()
	{
		mwpo=base_instance.ob_cl.multipleWindows_PageObjects();
		new_tab_title=mwpo.openAndSwitchToNewWindow();
	    title=mwpo.Check_NewTabTitle();
		Assert.assertEquals(new_tab_title, title);
	}
}
