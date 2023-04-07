package qaScripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IFramePageObjects;
import util.base;

public class IFrameTest {

	base base_instance;
	IFramePageObjects ifpo;
	String text="Hi!, I'm a Frame";
	public IFrameTest(base base_instance) {
		this.base_instance=base_instance;
	}
	
	@Test(description="Test switches to Iframe and types some text.Test asserts that the typed text is as expected.")
	public void switchAndCheckText() {
		ifpo=base_instance.ob_cl.iFrame_PageObjects();
		ifpo.ClickFrames();
		ifpo.ClickIFrames();
		ifpo.SwitchAndTypeText(text);
		String textFromFrame = ifpo.verifyText();
		Assert.assertEquals(textFromFrame, text);
	
}

}