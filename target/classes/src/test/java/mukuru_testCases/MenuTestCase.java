package mukuru_testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import mukuruBaseClass.BaseClass;
import mukuruPageObject.Menu;
import mukuruPageObject.Search;

public class MenuTestCase extends BaseClass  {
	
	Menu menu;
	
	@Test
	public void MenuNavigation() {
		
		menu = new Menu(driver);
		
		
		Assert.assertTrue(menu.callNumber().getText().contains("789"));
		
		menu.womanLink().click();
		menu.topsLink().click();
		menu.tshirtLink().click();
		
		System.out.println(menu.categoryText().getText());
		Assert.assertTrue(menu.categoryText().getText().contains("SHIRTS"));
		
	}
	
	
}
