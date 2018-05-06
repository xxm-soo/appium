package com.sunshine.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sunshine.pages.GuidePage;
import com.sunshine.pages.HomePage;
import com.sunshine.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Utils {

	DesiredCapabilities caps =null;
	public AppiumDriver<MobileElement> driver;
	public static Properties prop = new Properties();
	static InputStream input = null;
	
	GuidePage guidePage;
	LoginPage loginPage;
	HomePage homePage;

	UserCredentials credentials;

	@BeforeClass
	public AppiumDriver<MobileElement> getDriver() throws IOException {
		input = new FileInputStream("property/android.properties");
		prop.load(input);

		if (prop.getProperty("platform").equals("android")) {
			androidSetup();

		} else {
			if (prop.getProperty("platform").equals("ios")) {

			}
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;

	}

	public void androidSetup() throws MalformedURLException {
		caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Android"); 
		caps.setCapability("app", System.getProperty("user.dir") + "/build/HealthApp_V3.6.0_20170830.apk");
		caps.setCapability("platformVersion", "4.4");
		caps.setCapability("noSign","True");
		caps.setCapability("appPackage", "com.sun309.cup.health");
		caps.setCapability("appActivity", "com.sun309.cup.health.ui.WebActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void loginWithValidUser() throws InterruptedException, IOException {
		guidePage = new GuidePage(driver);
		guidePage.swipeLeftOper();		
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		homePage.waitForHomePage();
		/*credentials = new UserCredentials("13660441275", "111111");
		String userNameLoggedIn = loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
				.waitForHomePage().verifyUserIsLoggedIn();*/
		Assert.assertEquals(homePage.isDisplay(), true);

	}

}
