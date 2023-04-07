package util;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import pageObjects.Objects_Class;


public class base {

	public WebDriver driver;
	public String extracted;
	public Objects_Class ob_cl;
	public webDriver_class web_class;
	public switchToWindows stw;

	public base() throws IOException  {
		web_class = new webDriver_class();
		ob_cl = new Objects_Class(web_class.initialize());
		stw = new switchToWindows(web_class.initialize());

	}

}
