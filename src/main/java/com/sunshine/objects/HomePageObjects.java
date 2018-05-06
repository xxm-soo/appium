package com.sunshine.objects;

import org.openqa.selenium.WebElement;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjects {
	
	@AndroidFindBy(xpath="//android.widget.RadioGroup/android.widget.RadioButton[@text='首页']")
	@ElementDescription("原生底部首页元素")
	public MobileElement home;	

	@AndroidFindBy(xpath="//android.widget.RadioGroup/android.widget.RadioButton[@text='我的']")
	@ElementDescription("原生底部我的元素")
	public MobileElement perCenter;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='首页']")
	@ElementDescription("H5右上角首页元素")
	public MobileElement rightHome;
	
	
	@AndroidFindBy(id="Ret-var6")
	@ElementDescription("H5挂号元素")
	public MobileElement reg;
	
	@AndroidFindBy(id="Ret-var8")
	@ElementDescription("H5门诊缴费元素")
	public MobileElement clinic;
	
	

}
