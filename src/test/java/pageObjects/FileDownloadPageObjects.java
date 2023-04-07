package pageObjects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPageObjects {

	WebDriver driver;
	public FileDownloadPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='File Download']")
	private WebElement click_file_download;
	
	@FindBy(xpath="//div[@class='example']/a")
	private WebElement file_name;
	
	public void Click_FileDownload()
	{
		click_file_download.click();
	}
	
	public void Click_FileName()
	{
		file_name.click();
	}
	
	public boolean VerifyFileDownload()
	{
		String filename=file_name.getText();
		String downloadLocation=System.getProperty("user.dir")+"/Downloads/"+filename;
		File file=new File(downloadLocation);
		return file.exists();
	}
	
	
	
}
