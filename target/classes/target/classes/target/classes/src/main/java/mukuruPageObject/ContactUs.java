package mukuruPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
	
	public WebDriver driver;
	
	By contactUs = By.xpath("//div[@id='contact-link']//a[contains(text(),'Contact us')]");
	//By idContact = By.xpath("//select[@id='id_contact']");
	By emailAddrress = By.xpath("//input[@id='email']");
	By orderReference = By.xpath("//input[@id='id_order']");
	By fileUpload = By.xpath("//input[@id='fileUpload']");
	By textAreaMsg = By.xpath("//textarea[@id='message']");
	By sendButton = By.xpath("//span[contains(text(),'Send')]");
	By alertSuccess = By.xpath("//p[@class='alert alert-success']");
	By alertDanger = By.xpath("//div[@class='alert alert-danger']");
	
	@FindBy(xpath = "//select[@id='id_contact']")
	public WebElement headingSelect;
	
	
	public ContactUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void getHeading(int index) {
		Select sel = new Select(headingSelect);
		sel.getOptions();
		sel.selectByIndex(index);
	}
	
	public WebElement contactUs() {
		return driver.findElement(contactUs);
	}
	
	public WebElement emailAddrress() {
		return driver.findElement(emailAddrress);
	}
	
	public WebElement orderReference() {
		return driver.findElement(orderReference);
	}

	public WebElement fileUpload() {
		return driver.findElement(fileUpload);
	}
	
	public WebElement textAreaMsg() {
		return driver.findElement(textAreaMsg);
	}
	
	public WebElement sendButton() {
		return driver.findElement(sendButton);
	}
	
	public WebElement alertSuccess() {
		return driver.findElement(alertSuccess);
	}
	
	public WebElement alertDanger() {
		return driver.findElement(alertDanger);
	}
	
}
