package com.sunshine.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.ChooseDeptPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseDeptPage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public ChooseDeptPageObjects chooseDeptPageObjects = new ChooseDeptPageObjects();

	
	public ChooseDeptPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), chooseDeptPageObjects);
		runnerInfo=viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}
	
	public void waitForPageToLoaded() {
		waitForPageToLoad(chooseDeptPageObjects.subDeptList);
	}
	
	public void chooseDeptName(){
		waitForPageToLoaded();
		driver.context("WEBVIEW_com.sun309.cup.health");
		chooseDeptPageObjects.subDeptName.click();
		
		Alert alert =driver.switchTo().alert();
		alert.accept();
		driver.context("NATIVE_APP");
		//chooseDeptPageObjects.isOk.click();
	
	}

}
