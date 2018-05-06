package com.sunshine.pages;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.PayPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PayPage extends CommonAppiumTest {
	
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public PayPageObjects payPageObjects = new PayPageObjects();

	
	public PayPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), payPageObjects);
		runnerInfo=viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public void ConfirmPay(String payPassword) {
		
		swipeUp();
		payPageObjects.payBtn.click();		
		payPageObjects.payPassword.sendKeys(payPassword);
	}

}
