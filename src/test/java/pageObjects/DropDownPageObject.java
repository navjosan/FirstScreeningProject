package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPageObject {

	WebDriver driver;
	Select select;

	public DropDownPageObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "dropdown")
	private WebElement dropDown;

	public String DropDown() {
		select = new Select(dropDown);
		select.selectByVisibleText("Option 1");
		String text = dropDown.getText();
		return text;
	}

}
