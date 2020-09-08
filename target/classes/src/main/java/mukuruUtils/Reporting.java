package mukuruUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import mukuruBaseClass.BaseClass;

public class Reporting extends BaseClass implements ITestListener{

	public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();

    public void onStart(ITestContext results) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String reportName = "Test-Report-" + timeStamp + ".html";
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Report\\"+reportName);
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "\\src\\main\\java\\mukuruUtils\\extent-config.xml");
        
 //       htmlReporter.loadXMLConfig("C:\\Users\\a230794\\SBSA_Automation\\src\\main\\java\\configuration\\extent-config.xml");
        extent=new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

	public void onTestStart(ITestResult iTestResult) {
        test= extent.createTest(iTestResult.getMethod().getMethodName());
        extentTest.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().fail(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().skip(result.getThrowable());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}



}
