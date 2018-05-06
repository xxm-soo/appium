package com.sunshine.pages;

import org.openqa.selenium.support.PageFactory;

import com.sunshine.config.CommonAppiumTest;
import com.sunshine.config.DeviceInterface;
import com.sunshine.config.ViewFactory;
import com.sunshine.objects.OrderDetailPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderDetailPage extends CommonAppiumTest {
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public OrderDetailPageObjects orderDetailPageObjects = new OrderDetailPageObjects();

	public OrderDetailPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), orderDetailPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public boolean OrderStatus() {

		boolean result = false;
		try {
			result = orderDetailPageObjects.orderStatus.isDisplayed();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void CancelOrder() {
		swipeUp();
		orderDetailPageObjects.btnCancel.click();
	}

}
