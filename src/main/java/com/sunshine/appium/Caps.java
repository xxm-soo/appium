package com.sunshine.appium;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.sunshine.entity.Android;
import com.sunshine.utils.Proper;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Caps {
	public Android android;

	public Caps() {
	}

	private void androidCaps() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		// 手机操作系统的版本iOS, Android
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		// 使用的手机或模拟器类型
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		// 手机操作系统的版本7.1, 4.4
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, android.getOsVersion());
		// 本地绝对路径_或_远程 http URL 所指向的一个安装包
		desiredCapabilities.setCapability(MobileCapabilityType.APP,Proper.userDir + "/app/HealthApp_V3.6.0_20170830.apk");
		// 运行的 Android 应用的包名
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sun309.cup.health");
		// 从你的包中所要启动的 Android acticity
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.sun309.cup.health.ui.WebActivity");
		// 自动化测试的引擎
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		// 连接真机的唯一设备号
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, android.getDeviceID());
		// 跳过检查和对应用进行 debug 签名的步骤。仅适用于 UiAutomator，不适用于 selendroid
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.NO_SIGN, true);

	}

	private void iosCaps() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				"https://itunes.apple.com/cn/app/yi-cheng-tong-yu-yue-gua-hao/id989653289?mt=8");

	}
}
