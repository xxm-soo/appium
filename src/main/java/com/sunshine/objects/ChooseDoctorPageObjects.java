package com.sunshine.objects;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 选择医生
 * @author sigua
 *
 */
public class ChooseDoctorPageObjects {
	
	
	@AndroidFindBy(xpath="//section[@class='date-section']/div[@class='select-date']/div[3]")
	@ElementDescription("选择日期为后天")
	public MobileElement afterDay;
	
	@AndroidFindBy(xpath="//android.view.View[@index=1]/android.view.View[@index=0]/android.view.View[@index=2]")
	@ElementDescription("医生级别")
	public MobileElement doctorLevel;
	
	@AndroidFindBy(xpath="//section[@id='doctorList']/a[1]")
	@ElementDescription("医生列表第一个医生")
	public MobileElement doctor;

}
