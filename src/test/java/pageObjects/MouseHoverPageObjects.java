package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseHoverPageObjects {

	WebDriver driver;
	Actions actions;
	
	public MouseHoverPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Hovers']")
	private WebElement clickHovers;

	@FindBy(css = "div.figcaption h5")
	private List<WebElement> information;
	
	@FindBy(css="div.figure img")
	private List<WebElement> images;
	
	public void ClickHovers()
	{
		clickHovers.click();
	}
	
	public String mouseHover(int i)
	{
		actions= new Actions(driver);
		actions.moveToElement(images.get(i)).perform();
		return information.get(i).getText();
	}
	
}
