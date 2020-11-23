/*package tests;


	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.android.AndroidElement;
		import io.appium.java_client.remote.MobileCapabilityType;
		import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.By;
		import org.testng.annotations.*;
		import java.net.URL;
	import java.time.Duration;
	import java.net.MalformedURLException;
		import java.util.logging.Level;

		public class VewAlbums extends Baseclass {
		   
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
		    public void testUntitled() throws InterruptedException {
		    	 String path="C:\\javaWorkspace\\AppiumProject\\ExtentReport3\\createpost.html";
		  	    reportsetup(path);
		    	
		    	
		    	extent.createTest("view albums");
		    	 driver.findElement(By.xpath("//*[@id='tv_next']")).click();
		         driver.findElement(By.xpath("//*[@id='tv_next']")).click();
		         driver.findElement(By.xpath("//*[@id='tv_next']")).click();
		         driver.findElement(By.xpath("//*[@id='llt_login']")).click();
		         driver.findElement(By.xpath("//*[@id='username_text_input_layout']")).click();
		         driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout']")).click();
		         driver.findElement(By.xpath("//*[@id='edt_username']")).sendKeys("divya01@gmail.com");
		         driver.findElement(By.xpath("//*[@id='password_text_input_layout']")).click();
		         driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout']")).click();
		         driver.findElement(By.xpath("//*[@id='edt_password']")).sendKeys("Bharathi@1997");
		         driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']")).click();
		         driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout']")).click();
		         driver.findElement(By.xpath("//*[@id='tv_login']")).click();
		         
			       Thread.sleep(1000);
			        driver.findElement(By.xpath("//*[@id='i_settings']")).click();
			        
			        driver.findElement(By.xpath("//*[@id='iv_next_one']")).click();
			        driver.findElement(By.xpath("//*[@text='My Gallery']")).click();
			      
			        
			        driver.findElement(By.xpath("//*[@text='PHOTOS']")).click();
			        extent.flush();

}
		    @AfterMethod
		    public void tearDown() {
		        
		    }
}*/