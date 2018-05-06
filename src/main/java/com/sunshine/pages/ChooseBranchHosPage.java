package com.sunshine.pages;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.ChooseBranchHosPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseBranchHosPage extends CommonAppiumTest  {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public ChooseBranchHosPageObjects chooseBranchHosPageObjects = new ChooseBranchHosPageObjects();

	public ChooseBranchHosPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), chooseBranchHosPageObjects);
		runnerInfo=viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}
	
	public void waitForPageToLoaded() {
		waitForPageToLoad(chooseBranchHosPageObjects.hospitalBranchModel);
	}
	
	public void elementVisit() {
		waitForPageToLoad(chooseBranchHosPageObjects.hospitalBranchModel);
	}
	
	public void chooseHospitaBranchlName(){
		
		driver.context("WEBVIEW_com.sun309.cup.health");
		elementVisit();
		try {
			chooseBranchHosPageObjects.hospitalBranchName2.isDisplayed();
			chooseBranchHosPageObjects.hospitalBranchName2.click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.context("NATIVE_APP");
		
	}

}
