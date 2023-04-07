package pageObjects;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPageObjects {

	WebDriver driver;
	Robot rb;

	
	public FileUploadPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='File Upload']")
	private WebElement click_file_upload;
	
	@FindBy(id="file-upload")
	private WebElement choose_file;
	
	@FindBy(id="file-submit")
	private WebElement upload_button;

	@FindBy(xpath="//div/h3")
	private WebElement upload_message;

	
	public void Click_FileUpload()
	{
		click_file_upload.click();
	}
	
	public void Choose_File()
	{
		choose_file.click();
	}
		
	public String Submit_File()
	{
		upload_button.click();
		return upload_message.getText();
	}
	
	public void UploadingFile(String filename) throws AWTException
	{
		rb = new Robot();
		StringSelection str = new StringSelection(System.getProperty("user.dir")+"/Downloads/"+filename);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // Press Control+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // Release Control+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // For pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	   }
}
