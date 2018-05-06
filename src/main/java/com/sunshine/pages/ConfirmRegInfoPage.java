package com.sunshine.pages;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.ConfirmRegInfoPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConfirmRegInfoPage  extends CommonAppiumTest {
	
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public ConfirmRegInfoPageObjects confirmRegInfoPageObjects = new ConfirmRegInfoPageObjects();

	
	public ConfirmRegInfoPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), confirmRegInfoPageObjects);
		runnerInfo=viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public void ConfirmOrder() {
		
		if(confirmRegInfoPageObjects.patientName.isDisplayed()) {
			confirmRegInfoPageObjects.patientName.click();
		}
		for (int i = 0; i <2; i++) {
			swipeUp();
		}
		confirmRegInfoPageObjects.limitQrCodePay.click();
		confirmRegInfoPageObjects.btnSave.click();

	}
}
