package com.sunshine.config;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CommonAppiumTest {
	public AppiumDriver driver;
	Logger logger = Logger.getLogger(CommonAppiumTest.class);

	public CommonAppiumTest(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	/**
	 * 等待页面元素可点击
	 * 
	 * @param id
	 */
	public void waitForPageToLoad(WebElement id) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}

	/**
	 * 等待页面元素可定位
	 * 
	 * @param id
	 */
	public void waitForElementDisAppear(String id) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}

	public WebElement waitForElement(WebElement e) {
		waitForPageToLoad(e);
		WebElement element = e;
		return element;
	}

	public void swipeRightUntilLogOutScreen() {
		do {
			swipeRight();
		} while (!isElementPresent(By.id("")));
	}

	/**
	 * 判断元素是否存在
	 * 
	 * @param by
	 * @return
	 */
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public void swipeLeftUntilTextExists(String expected) {
		do {
			swipeLeft();
		} while (!driver.getPageSource().contains(expected));
	}

	/**
	 * 右滑动
	 */
	@SuppressWarnings("deprecation")
	public void swipeRight() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.9);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		driver.swipe(startx, starty, endx, starty, 5000);
	}

	/**
	 * 左滑动
	 */
	@SuppressWarnings("deprecation")
	public void swipeLeft() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.9);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		driver.swipe(startx, starty, endx, starty, 1000);
	}

	/**
	 * 上滑动
	 */
	@SuppressWarnings("deprecation")
	public void swipeUp() {
		Dimension size = driver.manage().window().getSize();
		int startX=(int)(size.width*0.5);
		int startY=(int)(size.height*0.75);
		int endY  =(int)(size.height*0.05);
		//driver.swipe(startX, startY, startX, endY, 1000);
	}

	@SuppressWarnings("deprecation")
	public void scrollDirection(MobileElement Id, SwipeElementDirection arg) {
		MobileElement e = Id;
		e.swipe(arg, 1000);
	}

	/**
	 * 二级科室向上滑动
	 */
	public void swipeSeconDept() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.height * 0.5);
		int endx = (int) (size.height * 0.25);
		int starty =(int) (size.width*0.4);
		driver.swipe(startx, starty, endx, starty, 1000);

	}

	/**
	 * method to set the context to required view.
	 *
	 * @param context
	 *            view to be set
	 */
	public void setContext(String context) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName); // prints out something like
												// NATIVE_APP \n WEBVIEW_1
		}
		driver.context((String) contextNames.toArray()[1]); // set context to
															// WEBVIEW_1

		logger.info("Current context" + driver.getContext());
	}

	public void clickBackButton() {
		driver.navigate().back(); // Closes keyboard
		// driver.navigate().back(); //Comes out of edit mode
	}

	public String getCurrentMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	public void logStepIntoExtentReport(String elementDescription, String action, String typeString) {
		ExtentTestManager.getTest().log(Status.INFO,
				elementDescription + "; " + withBoldHTML("Text") + ": " + typeString);
	}

	public String withBoldHTML(String string) {
		if (!string.trim().isEmpty()) {
			return "<b>" + string + "</b>";
		} else {
			return "";
		}
	}

	public String getPageObjectElemetDescription(Object pageObject, String fieldName) {
		try {
			return this.getClass().getAnnotation(PageName.class).value() + "::"
					+ pageObject.getClass().getField(fieldName).getAnnotation(ElementDescription.class).value();
		} catch (NoSuchFieldException e) {

			e.printStackTrace();
		}
		return "";
	}

}
