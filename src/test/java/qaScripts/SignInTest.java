package qaScripts;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.SignInPageObjects;
import util.base;

public class SignInTest {

	base base_instance;
	WebDriver driver;
	SignInPageObjects spo;

	public SignInTest(base base_instance) {
		this.base_instance = base_instance;
	}

	@Test(dataProvider = "getData",description="age Object Model for the login page should be provided.\r\n"
			+ "Test is able to login successfully.\r\n"
			+ "Test uses an assertion to make sure User has logged in.")
	public void SignInPage(String username, String password)  {
		
		spo=base_instance.ob_cl.sign_In_PageObjects();
		spo.Auth_Sign_in();
		spo.enterUsername(username);
		spo.enterPassword(password);
		spo.ClickLogin();
		String message=spo.ValidateMessage();
		System.out.println(message);
		if(username.equalsIgnoreCase("tomsmith") && password.equalsIgnoreCase("SuperSecretPassword!"))
		{
		Assert.assertEquals("You logged into a secure area", message);
		}
		
		else
			Assert.assertEquals("Your username is invalid",message);
	}
	
	@DataProvider
	public Object getData() {
		Object[][] obj = new Object[2][2];
		obj[0][0] = "tomsmith";						//Valid Credentials
		obj[0][1] = "SuperSecretPassword!";
		obj[1][0] = "Navpreet";						//Invalid Credentials
		obj[1][1] = "NavpreetKaur";
		return obj;
	}
}
