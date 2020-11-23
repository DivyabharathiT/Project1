/*package tests;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class exten {
	 public static com.relevantcodes.extentreports.ExtentReports reports;
	    public ExtentTest test;

	    

	    
	public static void reportsetup(String name) {
		String path=System.getProperty("user.dir")+"\\ExtentReports\\" + name +".html";
		reports =new com.relevantcodes.extentreports.ExtentReports(path);
		
	    reports.addSystemInfo("Tester", "divya");
	    reports.addSystemInfo("Testing Type", "Functional Testing");
		
		
		reporter.config().setDocumentTitle("TestReport");
		reporter.config().setReportName("SBN Test");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "divya");
		extent.setSystemInfo("Testing type", "Functional Testing");


}

}*/