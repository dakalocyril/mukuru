package mukuruPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	public WebDriver driver;
	
	By login = By.xpath("//a[@class='login']");
	By email = By.xpath("//input[@id='email_create']");
	By createAccount = By.xpath("//form[@id='create-account_form']//span[1]");
	By firstName = By.xpath("//input[@id='customer_firstname']");
	By lastName = By.xpath("//input[@id='customer_lastname']");
	By passWord = By.xpath("//input[@id='passwd']");
	By address = By.xpath("//input[@id='address1']");
	By city = By.xpath("//input[@id='city']");
	By postCode = By.xpath("//input[@id='postcode']");
//	By country = By.xpath("//select[@id='id_country']");
	By phoneNumber = By.xpath("//input[@id='phone_mobile']");
	By allias = By.xpath("//input[@id='alias']");
	By register = By.xpath("//span[contains(text(),'Register')]");
	By myAccount = By.xpath("//h1[@class='page-heading']");
	By accountInfo = By.xpath("//p[@class='info-account']");
	
	@FindBy(xpath = "//select[@id='id_state']")
	public WebElement stateSelect;
	
	
	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void getState(int index) {
		Select sel = new Select(stateSelect);
		sel.getOptions();
		sel.selectByIndex(index);
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement createAccount() {
		return driver.findElement(createAccount);
	}
	
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement passWord() {
		return driver.findElement(passWord);
	}
	
	public WebElement address() {
		return driver.findElement(address);
	}
	
	public WebElement city() {
		return driver.findElement(city);
	}
	
	public WebElement postCode() {
		return driver.findElement(postCode);
	}
	
	public WebElement phoneNumber() {
		return driver.findElement(phoneNumber);
	}
	
	public WebElement allias() {
		return driver.findElement(allias);
	}
	
	public WebElement register() {
		return driver.findElement(register);
	}
	
	public WebElement myAccount() {
		return driver.findElement(myAccount);
	}
	
	public WebElement accountInfo() {
		return driver.findElement(accountInfo);
	}
	
}
