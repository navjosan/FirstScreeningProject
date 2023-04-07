package pageObjects;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertsPageObjects {

	WebDriver driver;
	String message,end_result;
	Alert alert;
	
	JavaScriptAlertsPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='JavaScript Alerts']")
	private WebElement clickAlerts;
	
	@FindBy(css="button[onclick='jsAlert()']")
	private WebElement jsAlert;
	
	@FindBy(css="button[onclick='jsConfirm()']")
	private WebElement jsConfirm;
	
	@FindBy(css="button[onclick='jsPrompt()']")
	private WebElement jsPrompt;
	
	@FindBy(id="result")
	private WebElement result;
	
	
	
	public void ClickAlert()
	{
		clickAlerts.click();
	}
	
	public String CheckMessage()
	{
		end_result=result.getText();
		return end_result;
	}
	
	public String ClickJsAlert()
	{
		alert=driver.switchTo().alert();
		jsAlert.click();
		alert.accept();
		message=alert.getText();
		return message;
	}
	
	public String ClickJsConfirm(String action)
	{
		alert=driver.switchTo().alert();
		jsConfirm.click();
		if(action.equalsIgnoreCase("ok"))
			alert.accept();
		else if(action.equalsIgnoreCase("cancel"))
			alert.dismiss();
		message=alert.getText();
		return message;
	}
	
	public String ClickJsPrompt(String action, String message)
	{
		alert=driver.switchTo().alert();
		jsPrompt.click();
		if(action.equalsIgnoreCase("accept")) {
			alert.sendKeys(message);
			alert.accept();
		}
		else if(action.equalsIgnoreCase("cancel"))
			alert.dismiss();
		message=alert.getText();
		return message;
		
		
	}
}
