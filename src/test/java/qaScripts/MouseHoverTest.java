package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MouseHoverPageObjects;
import util.base;

public class MouseHoverTest {

	base base_instance;
	MouseHoverPageObjects mhpo;
	String text;
	
	public MouseHoverTest(base base_instance) {
		this.base_instance=base_instance;
	}
	
	@Test(description="Test does a mouse hover on each image.Test asserts that additional information is displayed for each image.")
	public void TestMouseHoverFunctionality()
	{
		
		mhpo=base_instance.ob_cl.mouseHover_PageObjects();
		mhpo.ClickHovers();
		mhpo.mouseHover(0);
		Assert.assertEquals(text,"name: user1");
		mhpo.mouseHover(1);
		Assert.assertEquals(text,"name: user2");
		mhpo.mouseHover(2);
		Assert.assertEquals(text,"name: user3");
	}
}
