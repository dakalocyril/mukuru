package mukuruBaseClass;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	 public static WebDriver driver;
	    public static Properties prop;
	    public static String baseURL;

	  @Parameters({"browser","url"})
	  @org.testng.annotations.BeforeClass
	    public static void setUp(String browserName, String baseURL) throws IOException {

	        System.out.println(browserName);

	        if (browserName.equalsIgnoreCase("firefox"))
	        {
	            driver = new FirefoxDriver();
	            System.out.println("Firefox has been launched");
	        }

	        else if (browserName.equalsIgnoreCase("chrome"))
	        {
	            ChromeOptions options = new ChromeOptions();
	            options.setExperimentalOption("useAutomationExtension", false);
	            driver = new ChromeDriver(options);
	            System.out.println("Chrome has been launched");

	        }

	        else if (browserName.equalsIgnoreCase("IE"))
	        {
	            driver = new InternetExplorerDriver();
	            System.out.println("IE has been launched");
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	        driver.get(baseURL);
	    }
	  
	  public String randomEmail(){
	        return RandomStringUtils.randomAlphabetic(6);
	    }
	  
	  public String randomNumber(){
	        return RandomStringUtils.randomNumeric(7);
	    }


	    @AfterClass
	    public void tearDown(){
	        driver.quit();
	    }


}
