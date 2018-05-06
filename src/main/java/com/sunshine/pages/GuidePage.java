package com.sunshine.pages;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.GuidePageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GuidePage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public GuidePageObjects guidePageObjects = new GuidePageObjects();

	public GuidePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), guidePageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

		waitForPageToLoad(guidePageObjects.pageview);
	}

	private boolean isExist() {

		return guidePageObjects.btn.isDisplayed();
	}

	public boolean swipeLeftOper() {
		
		System.out.println("dd:"+driver.getPageSource().toString());
		waitForPageToLoaded();
		Set<String> contextNames =driver.getContextHandles();
		System.out.println("您好"+contextNames);
		//driver.context("WEBVIEW_com.sun309.cup.health");//NATIVE_APP
		System.out.println("dd:"+driver.getPageSource().toString());
		System.out.println("当前content"+driver.getContext());
		for (int i = 0; i < 4; i++) {
			System.out.println("源码:"+driver.getPageSource().toString());
			if (isExist() && i == 3) {
				guidePageObjects.btn.click();
				return true;
			} else {
				if (i < 3) {
					swipeLeft();
				}
			}
		}
		return false;

	}

}
