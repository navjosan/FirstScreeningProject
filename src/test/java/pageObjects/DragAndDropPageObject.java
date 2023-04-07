package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPageObject {

	WebDriver driver;

	Actions actions;

	public DragAndDropPageObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "column-a")
	private WebElement source;

	@FindBy(id = "column-b")
	private WebElement destination;

	public String GetSourceText() {
		String before_drag_src = source.getText();
		return before_drag_src;
	}

	public String GetDestinationText() {
		String before_drag_dest = destination.getText();
		return before_drag_dest;
	}

	public void DragAndDrop() {
		actions = new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
	}

	public String GetSourceTextAfter() {
		String after_drag_src = source.getText();
		return after_drag_src;
	}

	public String GetDestinationTextAfter() {
		String after_drag_dest = destination.getText();
		return after_drag_dest;

	}

}
