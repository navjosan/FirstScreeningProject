package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationMessagePageObjects {

	WebDriver driver;
	String message;
	
	public NotificationMessagePageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "a[href='/notification_message']")
	private WebElement clickNotification;

	@FindBy(xpath="a[href='/notification_message']")
	private WebElement clickHere;
	
	@FindBy(id="flash")
	private WebElement flash;
	
	public void clickNotificationMessages()
	{
		clickNotification.click();
	}
	
	public String clickClickHere()
	{
		clickHere.click();
		message=flash.getText();
		return message;
	}
}
