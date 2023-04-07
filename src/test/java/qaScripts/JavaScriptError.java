package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.JavaScriptErrorPageObjects;
import util.base;

public class JavaScriptError {

	base base_instance;
	JavaScriptErrorPageObjects jepo;
	
	public JavaScriptError(base base_instance) {
		this.base_instance=base_instance;
	}
	
	@Test(description="Test finds the JavaScript error on the page.Test asserts that the page contains error: Cannot read property 'xyz' of undefined.")
	public void TestJavaScriptError()
	{
		jepo=base_instance.ob_cl.javaScriptError_PageObjects();
		jepo.ClickJavaScriptError();
		String jsError=jepo.checkJSError();
		Assert.assertEquals(jsError, "TypeError: Cannot read properties of undefined (reading 'xyz')");
	}
}
