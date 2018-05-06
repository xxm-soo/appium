package com.sunshine.screen.flows;

import java.io.IOException;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.pages.HomePage;
import com.sunshine.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidFlow extends CommonAppiumTest implements DeviceInterface{

	public AndroidFlow(AppiumDriver<MobileElement> driver) {
		super(driver);
		
	}

	@Override
	public void login(LoginPage loginPage, String username, String password) throws IOException, InterruptedException {
		loginPage.enterUserAndPassword(username, password);
		loginPage.signIn();
		
	}

	@Override
	public void waitForHomePage(HomePage homePage) {
		homePage.waitForHomePageToLoad();
		
	}

	@Override
	public void moveToLogOutScreen(HomePage homePage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeContent() {
		// TODO Auto-generated method stub
		
	}

}
