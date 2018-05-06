package com.sunshine.objects;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 选择挂号类型PAGE
 * @author sigua
 *
 */
public class ChooseRegTypePageObjects {

	@AndroidFindBy(xpath="//android.view.View[@content-desc='预约挂号']")
	@ElementDescription("预约挂号")
	public MobileElement oneDayRegType;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='当天挂号']")
	@ElementDescription("当天挂号")
	public MobileElement futureRegType;
}
