package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPageObject {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30000));

	public DynamicControlsPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Dynamic Controls']")
	private WebElement click_dynamicContent;

	@FindBy(xpath = "//form[@id='checkbox-example']/button")
	private WebElement clickButton;

	@FindBy(id = "message")
	private WebElement see_message;

	@FindBy(id = "checkbox")
	private WebElement check_box;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement textBox;

	public void ClickDynamicContent() {
		click_dynamicContent.click();
	}

	public void ClickButton() {
		clickButton.click();
	}

	public void ExplicitWaitForMessage() {
		wait.until(ExpectedConditions.visibilityOf(see_message));
	}

	public String GetMessage() {
		String text = see_message.getText();
		return text;
	}

	public void CheckBoxGone() {
		wait.until(ExpectedConditions.invisibilityOf(check_box));
	}

	public void CheckBoxBack() {
		wait.until(ExpectedConditions.visibilityOf(check_box));
	}

	public void TextBoxEnable() {
		wait.until(ExpectedConditions.visibilityOf(textBox));
	}

	public void TextBoxDisable() {
		wait.until(ExpectedConditions.invisibilityOf(textBox));
	}

}
