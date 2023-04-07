package qaScripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FileUploadPageObjects;
import util.base;

public class FileUploadTest {

base base_instance;
FileUploadPageObjects fupo;

	FileUploadTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test uses Upload Button or Drag and Drop to upload a file.Test asserts that the file is uploaded.")
	public void File_Upload_Test() throws AWTException{
		fupo=base_instance.ob_cl.fileUpload_PageObjects();
		fupo.Click_FileUpload();
		fupo.Choose_File();
		fupo.UploadingFile("some-file.txt");
		String upload_message=fupo.Submit_File();
		Assert.assertEquals(upload_message, "File Uploaded!");
		
	}

}
