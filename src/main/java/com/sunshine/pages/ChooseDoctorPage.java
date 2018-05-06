package com.sunshine.pages;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.ChooseDoctorPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseDoctorPage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public ChooseDoctorPageObjects chooseDoctorPageObjects = new ChooseDoctorPageObjects();

	public ChooseDoctorPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), chooseDoctorPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public void chooseDoctor() {
		
		chooseDoctorPageObjects.afterDay.click();
		if (chooseDoctorPageObjects.doctor.isDisplayed()) {
			chooseDoctorPageObjects.doctor.click();
		}

	}

}
