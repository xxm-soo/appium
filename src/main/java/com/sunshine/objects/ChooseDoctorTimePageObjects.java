package com.sunshine.objects;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 选择医生分时
 * @author sigua
 *
 */
public class ChooseDoctorTimePageObjects {
	
	
	@AndroidFindBy(xpath="//div[@id='doctorTimes']/a[1]")
	@ElementDescription("医生分时第一时段")
	public MobileElement doctorTime;
	
	
	
	

}
