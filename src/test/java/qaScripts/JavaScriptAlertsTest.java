package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.JavaScriptAlertsPageObjects;
import util.base;

public class JavaScriptAlertsTest {

	base base_instance;
	JavaScriptAlertsPageObjects japo;
	String alert_message,end_message;
	
	
	JavaScriptAlertsTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test Clicks on JS Alert Button.Test asserts alert message.")
	public void TestJsAlertButton()
	{
		japo=base_instance.ob_cl.javaScriptAlerts_PageObjects();
		japo.ClickAlert();
		alert_message=japo.ClickJsAlert();
		Assert.assertEquals(alert_message, "I am a JS Alert");
		end_message=japo.CheckMessage();
		Assert.assertEquals(end_message,"You successfuly clicked an alert");
	}
	
	@Test(description="Test clicks on JS confirm Button and clicks ok on alert.Test asserts the alert message.")
	public void TestJsConfirm()
	{
		japo.ClickAlert();
		alert_message=japo.ClickJsConfirm("ok");
		Assert.assertEquals(alert_message, "I am a JS Confirm");
		end_message=japo.CheckMessage();
		Assert.assertEquals(end_message,"You clicked:Ok");
		alert_message=japo.ClickJsConfirm("cancel");
		Assert.assertEquals(alert_message, "I am a JS Confirm");
		end_message=japo.CheckMessage();
		Assert.assertEquals(end_message,"You clicked:Cancel");
		
	}
	
	@Test(description="Test clicks on JS Prompt Button and types a message on Prompt.Test asserts that the alert message contains the typed message.")
	public void TestJsPrompt()
	{
		japo.ClickAlert();
		alert_message=japo.ClickJsPrompt("ok","Hi! I'm from textbox");
		Assert.assertEquals(alert_message, "I am a JS prompt");
		end_message=japo.CheckMessage();
		Assert.assertEquals(end_message,"You entered:Hi! I'm from textbox");
		alert_message=japo.ClickJsPrompt("cancel","");
		Assert.assertEquals(alert_message, "I am a JS prompt");
		end_message=japo.CheckMessage();
		Assert.assertEquals(end_message,"You entered:null");
	}
}
