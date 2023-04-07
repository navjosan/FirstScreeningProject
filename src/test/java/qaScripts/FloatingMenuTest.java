package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FloatingMenuPageObjects;
import util.base;

public class FloatingMenuTest {

	base base_instance;
	FloatingMenuPageObjects fmpo;
	public FloatingMenuTest(base base_instance) {
		this.base_instance=base_instance;
	}
	
	@Test(description="Test scrolls the page.Test asserts that the floating menu is still displayed.")
	public void TestFloatingMenu()
	{
		fmpo=base_instance.ob_cl.floatingMenu_PageObjects();
		fmpo.ClickFloatingMenu();
		boolean beforeScroll=fmpo.CheckFloatingMenu();
		Assert.assertEquals(beforeScroll, true);
		fmpo.ScrollMenu();
		boolean afterScroll=fmpo.CheckFloatingMenu();
		Assert.assertTrue(afterScroll);
	}
}
