package mukuruPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Menu {
	
	public WebDriver driver;
	
	By callNumber = By.xpath("//span[@class='shop-phone']");
	By womanLink = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
	By topsLink = By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Tops')]");
	By tshirtLink = By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'T-shirts')]");
	By categoryText = By.xpath("//h1[@class='page-heading product-listing']//span[@class='cat-name']");
	
	public Menu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement callNumber() {
		return driver.findElement(callNumber);
	}
	
	public WebElement womanLink() {
		return driver.findElement(womanLink);
	}
	
	public WebElement topsLink() {
		return driver.findElement(topsLink);
	}

	public WebElement tshirtLink() {
		return driver.findElement(tshirtLink);
	}
		
	public WebElement categoryText() {		
		return driver.findElement(categoryText);
	}
}
