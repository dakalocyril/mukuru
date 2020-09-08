package mukuru_testCases;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import mukuruBaseClass.BaseClass;
import mukuruPageObject.Search;

public class TC_Search extends BaseClass {
	Search search;
	
	@Test
	public void SearchProduct() {
		search = new Search(driver);
		
		search.searchTextBox().sendKeys("Printed dress");
		search.searchButton().click();
		
		for(WebElement list : search.dressList) {
			if(list.getText().equalsIgnoreCase("printed dress")) {
				System.out.println(list.getText());
				Assert.assertTrue(list.getText().equalsIgnoreCase("Printed dress"));
			}
		}
	}
	

	@Test
	public void SearchProductNegative() throws InterruptedException {
		
		search.searchTextBox().clear();
		search.searchTextBox().sendKeys("Cape Town");
		search.searchButton().click();
		
		System.out.println(search.noResultsFound().getText());
		Assert.assertTrue(search.noResultsFound().getText().contains("No results"));
	}


}
