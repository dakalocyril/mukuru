package mukuru_testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import mukuruBaseClass.BaseClass;
import mukuruPageObject.ContactUs;

public class TC_ContactUS extends BaseClass{
	ContactUs contactUs;
	
	@Test
	public void contactUsPositive() {
		contactUs = new ContactUs(driver);
		
		contactUs.contactUs().click();
		String email = randomEmail() +"@gmail.com";
		String number = randomNumber();
		
		//Selecting second index
		//1-Customer Service
		//2-WebMaster
		contactUs.getHeading(1);
		
		contactUs.emailAddrress().sendKeys(email);
		contactUs.orderReference().sendKeys(number);
		contactUs.fileUpload().sendKeys("C:\\Users\\a230794\\Desktop\\Mukuru\\mukuru.txt");
		contactUs.textAreaMsg().sendKeys("Automation is the future");
		contactUs.sendButton().click();
		
		System.out.println(contactUs.alertSuccess().getText());
		Assert.assertTrue(contactUs.alertSuccess().getText().contains("successfully"));
	}

	@Test
	public void contactUsNeg() {
		contactUs = new ContactUs(driver);
		
		contactUs.contactUs().click();
		String email = randomEmail() +"@gmail.com";
		String number = randomNumber();
		
		//Selecting second index
		//1-Customer Service
		//2-WebMaster
		contactUs.getHeading(1);
	
		contactUs.emailAddrress().sendKeys(email);
		contactUs.orderReference().sendKeys(number);
		contactUs.fileUpload().sendKeys("C:\\Users\\a230794\\Desktop\\Mukuru\\mukuru.txt");
		contactUs.sendButton().click();
		
		System.out.println(contactUs.alertDanger().getText());
		Assert.assertTrue(contactUs.alertDanger().getText().contains("error"));
		
		//System.out.println(contactUs.alertSuccess().getText());
		//Assert.assertTrue(contactUs.alertSuccess().getText().contains("successfully"));
	}
}
