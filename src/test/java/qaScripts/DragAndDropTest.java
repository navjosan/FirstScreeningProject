package qaScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DragAndDropPageObject;
import util.base;

public class DragAndDropTest {

	base base_instance;
	DragAndDropPageObject ddpo;
	
	DragAndDropTest(base base_instance)
	{
		this.base_instance=base_instance;
	}
	
	@Test(description="Test drags element A to element B.\r\n"
			+ "Test asserts that the text on element A and B are switched.\r\n"
			+ "")
	public void DragAndDrop()
	{
		ddpo=base_instance.ob_cl.dragAndDrop_PageObjects();
		String before_drag_src=ddpo.GetSourceText();
		String before_drag_dest=ddpo.GetDestinationText();
		ddpo.DragAndDrop();
		String after_drag_src=ddpo.GetSourceTextAfter();
		String after_drag_dest=ddpo.GetDestinationTextAfter();
		Assert.assertEquals(before_drag_src, after_drag_dest);
		Assert.assertEquals(before_drag_dest, after_drag_src);
	}
}
