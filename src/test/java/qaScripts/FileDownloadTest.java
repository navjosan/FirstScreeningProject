package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FileDownloadPageObjects;
import util.base;

public class FileDownloadTest {

base base_instance;
FileDownloadPageObjects fdpo;

	FileDownloadTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test clicks on the file.Test asserts that the file is downloaded.")
	public void File_Download_Test(){
		fdpo=base_instance.ob_cl.fileDownload_PageObjects();
		fdpo.Click_FileDownload();
		fdpo.Click_FileName();
		boolean download=fdpo.VerifyFileDownload();
		Assert.assertTrue(download,"File Downloaded Successfully");
	}

}
