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
	import java.util.logging.Level;/*

	/*public class AddProfileInfo extends Baseclass {
	    private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    protected AndroidDriver<AndroidElement> driver = null;

	    DesiredCapabilities dc = new DesiredCapabilities();
	    
	    @BeforeMethod
	    public void setUp() throws MalformedURLException {
	        dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, "33966f3c0904");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.starsbrandingnetwork.sbn");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "obs.sbn.sprint1.views.activity.SplashActivity");
	        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	    }

	    @Test
	    public void testUntitled() throws InterruptedException {
	    	
	    	reportsetup("C:\\javaWorkspace\\AppiumProject\\Report\\AddProfile.html");
	    	extent.createTest("Add profile Test");
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
	         
		       driver.findElement(By.xpath("//*[@class='android.view.ViewGroup']")).click();
		       Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id='i_settings']")).click();
	   
	       

	
	         driver.findElement(By.xpath("//*[@id='iv_next_one']")).click();
	         driver.findElement(By.xpath("//*[@id='iv_edit']")).click();
	         driver.findElement(By.xpath("//*[@id='iv_camera_profile']")).click();
	         driver.findElement(By.xpath("//*[@id='iv_gallery']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//*[@id='icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Gallery']]]")).click();
	         driver.findElement(By.xpath("//*[@text='Albums']")).click();
	         driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@text='Recent']]")).click();
	         driver.findElement(By.xpath("//*[@id='pick_num_indicator' and ./parent::*[./parent::*[@contentDescription='Photo taken on 6 November, 2020 16:55:39']]]")).click();
	         driver.findElement(By.xpath("//*[@text='CROP']")).click();
	         driver.findElement(By.xpath("//*[@text='DONE']")).click();
	       
	         driver.findElement(By.xpath("//*[@id='iv_camera_cover']")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//*[@id='iv_gallery']")).click();
	         driver.findElement(By.xpath("//*[@id='icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Gallery']]]")).click();
	         driver.findElement(By.xpath("//*[@text='Albums']")).click();
	         driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@text='Recent']]")).click();
	         driver.findElement(By.xpath("//*[@id='pick_num_indicator' and ./parent::*[./parent::*[@contentDescription='Photo taken on 6 November, 2020 16:53:42']]]")).click();
	         
	         driver.findElement(By.xpath("//*[@text='CROP']")).click();
	         driver.findElement(By.xpath("//*[@text='DONE']")).click();
	         driver.findElement(By.xpath("//*[@id='viewThree']")).click();
	         
	     //  Thread.sleep(1000);
	      //  driver.findElement(By.xpath("//*[@class='android.widget.ScrollView']")).click();
	      //  driver.findElement(By.xpath("//*[@id='tv_save']")).click();
	     }

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    river.findElement(By.xpath("//*[@id='icon' and ./parent::*[@id='i_settings']]")).click();
        driver.findElement(By.xpath("//*[@id='iv_next_one']")).click();
        driver.findElement(By.xpath("//*[@id='iv_camera_profile']")).click();
        driver.findElement(By.xpath("//*[@id='iv_camera_profile']")).click();
        driver.findElement(By.xpath("//*[@id='iv_gallery']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='Photo taken on 14-Nov-2020 11:18:00 AM']")).click();
        driver.findElement(By.xpath("//*[@text='CROP']")).click();
        driver.findElement(By.xpath("//*[@text='DONE']")).click();
        driver.findElement(By.xpath("//*[@id='tv_cover_edit']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='tv_cover_edit']")));
        driver.findElement(By.xpath("//*[@id='tv_cover_edit']")).click();
        driver.findElement(By.xpath("//*[@id='iv_camera_cover']")).click();
        driver.findElement(By.xpath("//*[@id='iv_gallery']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Download']]")).click();
        driver.findElement(By.xpath("//*[@contentDescription='Photo taken on 15-Aug-2020 11:28:30 PM']")).click();
        new TouchAction(driver).press(402, 1130).waitAction(Duration.ofMillis(385)).moveTo(330, 647).release().perform();
        driver.findElement(By.xpath("//*[@text='CROP']")).click();
        driver.findElement(By.xpath("//*[@text='DONE']")).click();
        new TouchAction(driver).press(910, 1417).waitAction(Duration.ofMillis(730)).moveTo(910, 1207).release().perform();
        driver.findElement(By.xpath("//*[@text='Save Changes']")).click();

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    


	    	
	    	
	       
	      


	    

	    @AfterMethod
	    public void tearDown() {
	        extent.flush();
	    }
	}
*/

