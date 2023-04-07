package pageObjects;

import org.openqa.selenium.WebDriver;



public class Objects_Class {

	WebDriver driver;
	SignInPageObjects sign_in;
	CheckBoxesPageObject checkbox;
	ContextMenuPageObject context;
	DragAndDropPageObject ddpo;
	DropDownPageObject drop;
	DynamicContentPageObject dynamic_content;
	DynamicControlsPageObject dynamic_controls;
	DynamicLoadingPageObjects dlpo;
	FileDownloadPageObjects fdpo;
	FileUploadPageObjects fupo;
	FloatingMenuPageObjects fmpo;
	IFramePageObjects ifpo;
	MouseHoverPageObjects mhpo;
	JavaScriptAlertsPageObjects japo;
	MultipleWindowsPageObjects mwpo;
	JavaScriptErrorPageObjects jepo;
	NotificationMessagePageObjects nmpo;
	
	 public Objects_Class(WebDriver driver) {
			
			this.driver = driver;
		}
	 
	 public SignInPageObjects sign_In_PageObjects()
	 {
		 sign_in=new SignInPageObjects(driver);
		 return sign_in;
	 }
	 
	 public CheckBoxesPageObject checkBoxes_PageObjects()
	 {
		 checkbox = new CheckBoxesPageObject(driver);
		 return checkbox;
	 }
	 
	 public ContextMenuPageObject contextMenu_PageObjects()
	 {
		 context = new ContextMenuPageObject(driver);
		 return context;
	 }
	 
	 public DragAndDropPageObject dragAndDrop_PageObjects()
	 {
		 ddpo = new DragAndDropPageObject(driver);
		 return ddpo;
	 }
	 
	 public DropDownPageObject dropDown_PageObjects()
	 {
		 drop = new DropDownPageObject(driver);
		 return drop;
	 }
	 
	 public DynamicContentPageObject dynamicContent_PageObject()
	 {
		 dynamic_content= new DynamicContentPageObject(driver);
		 return dynamic_content;
	 }
	 
	 public DynamicControlsPageObject dynamicControls_PageObject()
	 {
		 dynamic_controls= new DynamicControlsPageObject(driver);
		 return dynamic_controls;
	 }
	 
	 public DynamicLoadingPageObjects dynamicLoading_PageObjects()
	 {
		 dlpo=new DynamicLoadingPageObjects(driver);
		 return dlpo;
	 }
	 
	 public FileDownloadPageObjects fileDownload_PageObjects()
	 {
		 fdpo=new FileDownloadPageObjects(driver);
		 return fdpo;
	 }
	 
	 public FileUploadPageObjects fileUpload_PageObjects()
	 {
		 fupo=new FileUploadPageObjects(driver);
		 return fupo;
	 }
	 
	 public FloatingMenuPageObjects floatingMenu_PageObjects()
	 {
		 fmpo=new FloatingMenuPageObjects(driver);
		 return fmpo;
	 }
	 
	 public IFramePageObjects iFrame_PageObjects()
	 {
		 ifpo= new IFramePageObjects(driver);
		 return ifpo;
	 }
	 
	 public MouseHoverPageObjects mouseHover_PageObjects()
	 {
		 mhpo=new MouseHoverPageObjects(driver);
		return mhpo;
	 }
	 
	 public JavaScriptAlertsPageObjects javaScriptAlerts_PageObjects()
	 {
		 japo=new JavaScriptAlertsPageObjects(driver);
		 return japo;
	 }
	 
	 public MultipleWindowsPageObjects multipleWindows_PageObjects()
	 {
		 mwpo=new MultipleWindowsPageObjects(driver);
		 return mwpo;
	 }
	 
	 public JavaScriptErrorPageObjects javaScriptError_PageObjects()
	 {
		 jepo=new JavaScriptErrorPageObjects(driver);
		 return jepo;
	 }
	 
	 public NotificationMessagePageObjects notificationMessage_PageObjects()
	 {
		 nmpo=new NotificationMessagePageObjects(driver);
		 return nmpo;
	 }
}
