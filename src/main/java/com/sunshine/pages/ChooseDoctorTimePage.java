package com.sunshine.pages;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.ChooseDoctorTimePageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseDoctorTimePage extends CommonAppiumTest {
	
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public ChooseDoctorTimePageObjects chooseDoctorTimePageObjects = new ChooseDoctorTimePageObjects();

	
	public ChooseDoctorTimePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), chooseDoctorTimePageObjects);
		runnerInfo=viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public void chooseDoctortime() {
		chooseDoctorTimePageObjects.doctorTime.click();
	}
}
