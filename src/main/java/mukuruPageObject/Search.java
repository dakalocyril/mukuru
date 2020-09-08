package mukuruPageObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Search {
	
	public WebDriver driver;
	
	By searchTextBox = By.xpath("//input[@name='search_query']");
	By searchButton = By.xpath("//button[@name='submit_search']");
	By noResultsFound = By.xpath("//p[@class='alert alert-warning']");
//	By printedDress = By.cssSelector("a.product-name");
	//By printedDress = By.xpath("//div[@class='product-container']//img[@title='Printed Dress']");
	//By dressList = By.xpath("//div[@class='columns-container']//a[contains(text(),'Printed')]");
	@FindBy(xpath = "//h5[@itemprop='name']")
	public List<WebElement> dressList;
	
	public Search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void getDressList() {
		int size = dressList.size();
		System.out.println(size);
		
		
	}

	public WebElement searchTextBox() {
		return driver.findElement(searchTextBox);
	}
	
	public WebElement searchButton() {
		return driver.findElement(searchButton);
	}
	
	public WebElement noResultsFound() {
		return driver.findElement(noResultsFound);
	}
	
}
