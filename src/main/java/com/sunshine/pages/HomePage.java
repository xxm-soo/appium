package com.sunshine.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.HomePageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	HomePageObjects homePageObjects = new HomePageObjects();

	public HomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// 初始化页面元素
		PageFactory.initElements(new AppiumFieldDecorator(driver), homePageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public HomePage waitForHomePage() {
		runnerInfo.waitForHomePage(this);
		return new HomePage(driver);
	}

	/**
	 * 等带挂号元素出现
	 */
	public void waitForHomePageToLoad() {
		waitForElement(homePageObjects.reg);
	}

	/**
	 * 等带门诊缴费元素出现
	 * 
	 * @return true:出现,false:没出现
	 */
	public boolean isDisplay() {

		return homePageObjects.clinic.isDisplayed();
	}

	/**
	 * 得到门诊缴费TEXT
	 * 
	 * @return 门诊缴费
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public String verifyUserIsLoggedIn() throws InterruptedException, IOException {
		// new ScreenShotManager().captureScreenShot("LoggedInUser");
		return homePageObjects.clinic.getText();
	}

	/**
	 *个人中心
	 */
	public void clickMyCenter() {

		homePageObjects.perCenter.click();
	}

	/**
	 * HOME挂号
	 */
	public void clickReg(ChooseHospitalPage chooseHospitalPage) {
		
		homePageObjects.reg.click();
		chooseHospitalPage.visitCity();
	}

}
