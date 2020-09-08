package mukuru_testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import mukuruBaseClass.BaseClass;
import mukuruPageObject.Registration;

public class TC_Registrattion extends BaseClass {
	
	@Test
	public void registration() {
		Registration registration = new Registration(driver);
		
		String email = randomEmail() + "@gmail.com";
		String phone = "097" + randomNumber();
		
		//System.out.println(phone);
		
		registration.login().click();
		registration.email().sendKeys(email);
		registration.createAccount().click();
		registration.firstName().sendKeys("jumbooooo");
		registration.lastName().sendKeys("Jeeeeeeeeeeet");
		registration.passWord().sendKeys("mmasams");
		registration.address().sendKeys("1443 alabama");
		registration.city().sendKeys("New York");
		registration.getState(3);
		registration.postCode().sendKeys("35094");
		registration.phoneNumber().sendKeys(phone);
		registration.allias().sendKeys("2324 Come Street");
		registration.register().click();
		
		System.out.println(registration.myAccount().getText());
		Assert.assertEquals(registration.myAccount().getText(),"MY ACCOUNT");
		Assert.assertTrue(registration.accountInfo().getText().contains("Welcome"));
	}

}
