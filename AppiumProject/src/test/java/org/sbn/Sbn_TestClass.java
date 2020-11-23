package org.sbn;

import java.io.IOException
;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class Sbn_TestClass extends PojoClass {
	
	static String path="C:\\javaWorkspace\\AppiumProject\\Excel\\SbnExcel.xlsx";
	
	@BeforeMethod
    public void setUp() throws MalformedURLException {
         launch();
    }
	
	@Test
	public void registerTest() throws IOException, InterruptedException
	{
		report("Register Test");
		 ExtentTest logger1=  extent.createTest("Register Test");
		PojoClass p1=new PojoClass();
		click(p1.getNext());
		click(p1.getNext());
		click(p1.getNext());
		click(p1.getCreateacc());
		send(p1.getFirstname(), read(1,0, path));
		String name1 = p1.getFirstname().getText();
		System.out.println(name1);
		
			if(name1.equals("Visnu "))
			{
				logger1.log(Status.PASS, "FirstName  is entered correctly" );
				logger1.log(Status.INFO, "Firstname : Visnu ");
				
			}
			else
			{
				logger1.log(Status.FAIL, "FirstName is entered wrongly");
			}
			
		
		send(p1.getLastname(), read(1, 1, path));
		String name2 = p1.getLastname().getText();
		System.out.println(name2);
		if(name2.equals("Priya"))
			{
				logger1.log(Status.PASS, "LastName  is entered correctly");
				logger1.log(Status.INFO, "LastName : Priya");
				
			}
			else
			{
				logger1.log(Status.FAIL, "LastName is entered wrongly");
			}
	
		
		send(p1.getBusinessname(),read(1, 2, path));
		String name3 = p1.getBusinessname().getText();
		System.out.println(name3);
		if(name3.equals("VP-142012"))
			{
				logger1.log(Status.PASS, "Businessname  is entered correctly");
				logger1.log(Status.INFO, "BusinessName : VP-14201 ");
				
			}
			else
			{
				logger1.log(Status.FAIL, "Businessname is entered wrongly");
			}
		
		send(p1.getEmail(),read(1, 3, path));
		String name4 = p1.getEmail().getText();
		System.out.println(name4);
		if(name4.equals("Visnu12@gmail.com"))
			{
				logger1.log(Status.PASS, "email  is entered correctly");
				logger1.log(Status.INFO, "Email  : Visnu1@gmail.com");
				
			}
			else
			{
				logger1.log(Status.FAIL, "email is entered wrongly");
			}
		
		
		click(p1.getLinearLayout());
		click(p1.getFramelayout());
		send(p1.getPass(), read(1, 4, path));
		String pass1 = p1.getPass().getText();
		System.out.println(pass1);
		if(pass1.equals("Hello*1997$"))
			{
				logger1.log(Status.PASS, "password  is entered correctly");
				logger1.log(Status.INFO, "Password : Hello*1997$");
				
			}
			else
			{
				logger1.log(Status.FAIL, "password is entered wrongly");
			}
		
		click(p1.getBtnconfirmpass());
		click(p1.getFramelayout());
		send(p1.getConfirmpass(), read(1, 5, path));
		String pass2 = p1.getPass().getText();
		System.out.println(pass2);
		if(pass2.equals("Hello*1997$"))
			{
				logger1.log(Status.PASS, "confirm password  is entered correctly");
				logger1.log(Status.INFO, "confirm Password : Hello*1997$");
				
			}
			else
			{
				logger1.log(Status.FAIL, "confirm password is entered wrongly");
			}
		logger1.log(Status.INFO, "confirm Password : Hello*1997$");
		click(p1.getBtnregister());
		logger1.log(Status.INFO, "verify Whether it redirected to Add Profile page");
		Thread.sleep(1000);
		String addprofile = p1.getAddProfile().getText();
		System.out.println(addprofile);
		if(addprofile.equals("Add Profile"))
		{
			logger1.log(Status.PASS, "Registered successfully");
			
		}
		else
		{
			logger1.log(Status.FAIL, "Already registered user");
		}
		screen("Regsiter");
		extent.flush();
			}
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
	      report("Login Test");
	    ExtentTest logger=  extent.createTest("Login Test");
	    
		PojoClass p2=new PojoClass();
		click(p2.getNext());
		Thread.sleep(1000);
		click(p2.getNext());
		Thread.sleep(1000);
		click(p2.getNext());
		Thread.sleep(1000);
		click(p2.getLgn());
		Thread.sleep(1000);
		click(p2.getUserlayout());
		click(p2.getFramelayout());
		send(p2.getUsername(), read(1, 3, path));
		String email = p2.getUsername().getText();
		System.out.println(email);
	
	   if(email.equals("Visnu12@gmail.com"))
		{
			logger.log(Status.PASS, "Username is entered correctly");
			logger.log(Status.INFO, "Username : Visnu12@gmail.com");
			
		}
		else
		{
			logger.log(Status.FAIL, "Username is entered wrongly");
		}
		Thread.sleep(1000);
	  click(p2.getPassLayout());
	  click(p2.getFramelayout());
	  Thread.sleep(1000);
		send(p2.getPass(), read(1, 4, path));
		String password = p2.getPass().getText();
		System.out.println(password);
	
		if(password.equals("Hello*1997$"))
		{
			logger.log(Status.PASS, "Password is entered correctly");
			logger.log(Status.INFO, "Password : Hello*1997$");
		}
		else
		{
			logger.log(Status.FAIL, "Password is entered wrongly");
		}
		click(p2.getLinearLayout());
		click(p2.getFramelayout());
		click(p2.getLgnbtn());
		Thread.sleep(1000);
		String sm = p2.getSmart().getText();
		System.out.println(sm);
		
		//*[@text='SMART BLACK']
		if(sm.equals("SMART BLACK"))
		{
			logger.log(Status.INFO,"It redirected to the next page");
			logger.log(Status.PASS, "Login successfully");
			
		}
		else
		{
			logger.log(Status.FAIL, "Login Failed");
		}
		screen("Login");
		extent.flush();
		

	}
	
	@Test
	public static void changepassTest() throws IOException, InterruptedException {
		report("changepassword Test");
	    ExtentTest logger3=  extent.createTest("viewAlbums Test");
		PojoClass p3=new PojoClass();
     	Thread.sleep(1000);
	    click(p3.getSetting());
	    Thread.sleep(1000);
	    click(p3.getBtnchangepass());
	    send(p3.getCurrentpass(), read(1, 6, path));
	    String current = p3.getCurrentpass().getText();
		System.out.println(current);
	
		if(current.equals("Bharathi@1997"))
		{
			logger3.log(Status.PASS, "CurrentPassword is entered correctly");
			logger3.log(Status.INFO, "CurrentPassword : Bharathi@1997");
		}
		else
		{
			logger3.log(Status.FAIL, "CurrentPassword is entered wrongly");
		}
	    send(p3.getNewpass(), read(1, 4, path));
	    String newpass = p3.getNewpass().getText();
		System.out.println(newpass);
	
		if(newpass.equals("Hello*1997$"))
		{
			logger3.log(Status.PASS, "NewPassword is entered correctly");
			logger3.log(Status.INFO, "NewPassword : Hello*1997$");
		}
		else
		{
			logger3.log(Status.FAIL, "NewPassword is entered wrongly");
		}
	    send(p3.getRenewpass(), read(1, 4, path));
	    String repass = p3.getNewpass().getText();
		System.out.println(repass);
	
		if(newpass.equals("Hello*1997$"))
		{
			logger3.log(Status.PASS, " Re-NewPassword is entered correctly");
			logger3.log(Status.INFO, "Re-NewPassword : Hello*1997$");
		}
		else
		{
			logger3.log(Status.FAIL, "Re-NewPassword is entered wrongly");
		}
	    click(p3.getBtnsubmit());
	    Thread.sleep(1000);
	    logger3.log(Status.INFO, "check whether password is updated successfully");
	    String name = p3.getUser().getText();
		System.out.println(name);
		
		
		if(name.equals("Email/Username"))                   
		{
			logger3.log(Status.INFO,"It redirected to the next page");
			logger3.log(Status.PASS, "Password changed successfully");
			
		}
		else
		{
			logger3.log(Status.FAIL, "Change password Failed");
		}
	    screen("changepass");
	    extent.flush();
	    
	    

	}
	
	@Test
	public void viewAlbum() throws InterruptedException, IOException {
		 report("ViewAlbums Test");
		    ExtentTest logger2=  extent.createTest("viewAlbums Test");
		    
		PojoClass p4=new PojoClass();
		Thread.sleep(1000);
		click(p4.getSetting());
		click(p4.getNextone());
		Thread.sleep(1000);
		click(p4.getBtngallery());
		logger2.log(Status.INFO, "viewing photos");
		click(p4.getTabphotos());
		logger2.log(Status.PASS, "photos viewed successfully");
		Thread.sleep(1000);
		screen("view albums");
		Thread.sleep(1000);
		extent.flush();

	}
	
	@Test
	public void createpostTest() throws InterruptedException, IOException
	{
		 report("createpost Test");
		    ExtentTest logger4=  extent.createTest("viewAlbums Test");
		PojoClass p5=new PojoClass();
		Thread.sleep(1000);
		click(p5.getSetting());
		click(p5.getNextone());
		click(p5.getCreatepost());
		logger4.log(Status.INFO, "add title to the post");
		send(p5.getPostTitle(),read(1, 7, path));
		logger4.log(Status.PASS, "Title updated");
		click(p5.getAddphotos());
		click(p5.getAllimages());
		click(p5.getPicture());
		click(p5.getBtnOk());
		click(p5.getBtnDone());
		logger4.log(Status.PASS, "added the picture");
		click(p5.getBtnPost());
		logger4.log(Status.PASS, "Posted successfully");
		screen("create post");
		extent.flush();
		
		
		
	}
	@Test
	public void AddProfileTest() throws InterruptedException, IOException {
		report("AddProfile Test");
	    ExtentTest logger5=  extent.createTest("AddProfile Test");
	    PojoClass p6=new PojoClass();
	  Thread.sleep(1000);
	 click(p6.getSetting());
	 click(p6.getNextone());
	 Thread.sleep(1000);
	 click(p6.getIvprofile());
	click(p6.getIvprofile());
	 click(p6.getGallery());
	 logger5.log(Status.INFO, "add profile pic");
	 Thread.sleep(1000);
	click(p6.getPic1());
	click(p6.getCrop());
	click(p6.getBtnDone());
	 logger5.log(Status.PASS, "Profile pic set successfully");
	 click(p6.getIvcover());
	 click(p6.getGallery());
     click(p6.getRelativeLayout());
	 logger5.log(Status.INFO, "add cover pic");
	 Thread.sleep(1000);
	 click(p6.getPic2());
	click(p6.getCrop());
	click(p6.getBtnDone());
	 logger5.log(Status.PASS, "cover pic set successfully");
	 click(p6.getSavechanges());
	 screen("AddProfile");
	 logger5.log(Status.PASS, "Profile updated successfully");
	 extent.flush();
	 
	 
	 
	 
	}
	
	
	
	
	
	
	
	@AfterMethod
	 public void tearDown() {
		driver.close();
	      
    }
}

	
	

