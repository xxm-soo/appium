package com.sunshine.screen.flows;

import java.io.IOException;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.pages.HomePage;
import com.sunshine.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class iOSFlow extends CommonAppiumTest implements DeviceInterface{

	public iOSFlow(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public void login(LoginPage loginPage, String username, String password) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForHomePage(HomePage homePage) {
		// TODO Auto-generated method stub
		
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
