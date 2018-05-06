package com.sunshine.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.ChooseHospitalPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseHospitalPage extends CommonAppiumTest {
	
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public ChooseHospitalPageObjects chooseHospitalPageObjects = new ChooseHospitalPageObjects();

	public ChooseHospitalPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), chooseHospitalPageObjects);
		runnerInfo=viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}
	
	public void waitForPageToLoaded() {
		waitForPageToLoad(chooseHospitalPageObjects.hospitalName);
	}
	
	public String visitCity() {
		String str="";
		try {
			driver.context("WEBVIEW_com.sun309.cup.health");
			str=chooseHospitalPageObjects.city.getText();
			driver.context("NATIVE_APP");
			return str;
		} catch (Exception e) {
			return str;
		}
	}
	
	public void choosekHospitalName(ChooseBranchHosPage chooseBranchHosPage){
		//[NATIVE_APP, WEBVIEW_com.sun309.cup.health]
		
		if(visitCity().equals("广州市")) {
			try {
				driver.context("WEBVIEW_com.sun309.cup.health");
				System.out.println(driver.getPageSource().toString());
				
				boolean s =chooseHospitalPageObjects.hospitalName.isDisplayed();
				chooseHospitalPageObjects.hospitalName.click();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		else {
			System.out.println("页面没加载");
		}
		chooseBranchHosPage.elementVisit();
		driver.context("NATIVE_APP");
		
	}

}
