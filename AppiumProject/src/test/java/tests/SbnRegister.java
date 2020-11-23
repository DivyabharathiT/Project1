/*package tests;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class SbnRegister  extends Baseclass {
    
   
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        
        dc.setCapability(MobileCapabilityType.UDID, "3594acce0804");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.starsbrandingnetwork.sbn");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "obs.sbn.sprint1.views.activity.SplashActivity");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void test() throws InterruptedException {
    	 String path="C:\\javaWorkspace\\AppiumProject\\ExtentReport2\\createpost.html";
 	    reportsetup(path);
    	
    	extent.createTest("Register Test");
        driver.context("NATIVE_APP");
        driver.findElement(By.xpath("//*[@id='tv_next']")).click();
        driver.findElement(By.xpath("//*[@id='tv_next']")).click();
        driver.findElement(By.xpath("//*[@id='tv_next']")).click();
        driver.findElement(By.xpath("//*[@id='tv_create_account']")).click();
        driver.findElement(By.xpath("//*[@id='edt_first_name']")).sendKeys("Divya");
        driver.findElement(By.xpath("//*[@id='edt_last_name']")).sendKeys("Bharathi");
        driver.findElement(By.xpath("//*[@id='edt_business_name']")).sendKeys("DB-199781");
        driver.findElement(By.xpath("//*[@id='edt_email']")).sendKeys("Bharathi199781@gmail.com");
        
        driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout']")).click();
        driver.findElement(By.xpath("//*[@id='edt_password']")).sendKeys("Hello*1997$");
        driver.findElement(By.xpath("//*[@id='til_confirm_password']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout']")).click();
        
        driver.findElement(By.xpath("//*[@id='edt_confirm_password']")).sendKeys("Hello*1997$");
     
        driver.findElement(By.xpath("//*[@id='tv_register']")).click();
        extent.flush();
        
    }

    @AfterMethod
    public void tearDown() {
      
    }
}
*/