package com.sunshine.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.annotation.values.PageName;
import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.LoginPageObjects;
import com.sunshine.objects.OrderDetailPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

@PageName("Login Page")
public class LoginPage extends CommonAppiumTest {
	
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public LoginPageObjects loginPageObjects =new LoginPageObjects();
	

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver),loginPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}
	
	public HomePage enterValidCredentails (String username, String password) throws IOException, InterruptedException {
		runnerInfo.login(this, username,password);
		return new HomePage(driver);
	}
	
	public String validateErrorMessage() {
		return driver.getPageSource();
	}
	
	public boolean validateUserNameFieldIsDisplayed() {
		return loginPageObjects.username.isDisplayed();
	}
	
	public void enterUserAndPassword(String user,String pass) throws InterruptedException, IOException {
		waitForPageToLoad(loginPageObjects.username);
		logStepIntoExtentReport(getPageObjectElemetDescription(loginPageObjects,"username"),"SendKeys",user);
		loginPageObjects.username.sendKeys(user);		
		new ScreenShotManager().captureScreenShot("UserName");
		
		logStepIntoExtentReport(getPageObjectElemetDescription(loginPageObjects,"password"),"SendKeys",pass);
		loginPageObjects.password.sendKeys(pass);
		new ScreenShotManager().captureScreenShot("Password");
	}
	
	public void signIn() {
		loginPageObjects.sign_btn.click();
	}
	
	public void enterSiteURL() {
        // TODO Auto-generated method stub
        //loginPageObjects.add_self_site.click();
       // loginPageObjects.server_url.sendKeys("https://vodqademo.wordpress.com");
    }

}
