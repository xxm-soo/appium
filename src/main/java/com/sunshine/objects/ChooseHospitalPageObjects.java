package com.sunshine.objects;

import org.openqa.selenium.support.FindBy;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 选择医院PAGE
 * @author sigua
 *
 */
public class ChooseHospitalPageObjects {
	
	
	@AndroidFindBy(accessibility="曾挂号医院")
	@ElementDescription("曾挂号医院")
	public MobileElement registeredHospital;
	
	@FindBy(xpath="//section[2]/a[@ret-hospitalid='98e66d8abede42f1aadba60946b2398d']")
	@ElementDescription("广州市皮肤病防治所")
	public MobileElement hospitalName;
	
	@FindBy(xpath="//section[2]/a[@ret-hospitalid='8cf31f3bc21246ad9c20ff6d84f39d1d']")
	@ElementDescription("测试医院")
	public MobileElement testHospitalName;
	
	@FindBy(xpath="//*[@id=\"positionName\"]")
	@ElementDescription("显示定位城市")
	public MobileElement city;
	
	
	

}
