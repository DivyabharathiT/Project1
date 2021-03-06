package org.sbn;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sbn_BaseClass {
	public static AndroidDriver<AndroidElement> driver;
	static DesiredCapabilities dc = new DesiredCapabilities();
	public 	static ExtentReports extent;
	
	public static void send(WebElement e,String txt) {
		e.sendKeys(txt);

	}
	
	public static void click(WebElement e) {
		e.click();

	}
	
	public static void launch() throws MalformedURLException {
		 
        dc.setCapability(MobileCapabilityType.UDID, "3594acce0804");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.starsbrandingnetwork.sbn");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "obs.sbn.sprint1.views.activity.SplashActivity");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);

	}
	public static String read(int row,int col,String path) throws IOException {
		File f=new File(path);
		FileInputStream fin=new FileInputStream(f);
		String value="";
		Workbook w=new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(col);
		int celltype = c.getCellType();
		
		if(celltype==1)
		{
		value = c.getStringCellValue();
		}
		else if (celltype==0) {
			if(DateUtil.isCellDateFormatted(c))
			{
				
				 java.util.Date date = c.getDateCellValue();
				 SimpleDateFormat sim=new SimpleDateFormat("mm-dd-yyyy");
				  value = sim.format(date);
			}
			else
			{
				double d = c.getNumericCellValue();
				long l=(long)d;
			 value = String.valueOf(l);
			}
			
		}
		return value;
		
		

	}
	

	public static void screen(String name) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\javaWorkspace\\AppiumProject\\Screenshot\\"+ name +".png");
	FileUtils.copyFile(src, dest);
	}
	
	public static void report(String name) {
		String path=System.getProperty("user.dir")+"\\ExtentReports\\" + name +".html";
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
		reporter.config().setDocumentTitle("TestReport");
		reporter.config().setReportName("SBN Test");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "divya");


}
	

	
}



