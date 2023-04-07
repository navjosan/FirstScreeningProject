package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NotificationMessagePageObjects;
import util.base;

public class NotificationMessageTest {

	base base_instance;
	NotificationMessagePageObjects nmpo;
	String[] message = {"Action successful", "Action unsuccesful, please try again"};
	String actual;

	public NotificationMessageTest(base base_instance) {
		this.base_instance=base_instance;
	}
	
	@Test(description="Test clicks on the Click Here link a multiple times.Test asserts that one of the “Action Successful”, “Action unsuccessful, please try again” and “Action Unsuccessful” messages show on click.")
	public void testNotificationMessage()
	{
		nmpo=base_instance.ob_cl.notificationMessage_PageObjects();
		nmpo.clickNotificationMessages();
		for (int i = 0; i <= 5; i++) {
			actual=nmpo.clickClickHere();
			Assert.assertEquals(actual, message);
		}

	}
}
