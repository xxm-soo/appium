package com.sunshine.pages;

import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.ChooseRegTypePageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseRegTypePage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public ChooseRegTypePageObjects chooseRegTypePageObjects = new ChooseRegTypePageObjects();

	
	public ChooseRegTypePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), chooseRegTypePageObjects);
		runnerInfo=viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public void waitForPageToLoaded() {
		waitForPageToLoad(chooseRegTypePageObjects.oneDayRegType);
	}
	
	public void chooseRegtype(){

		if(!chooseRegTypePageObjects.oneDayRegType.isDisplayed()){
			swipeUp();			
		}
		
		chooseRegTypePageObjects.oneDayRegType.click();
		
	}
}
