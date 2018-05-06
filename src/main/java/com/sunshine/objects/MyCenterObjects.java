package com.sunshine.objects;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyCenterObjects {
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='我的']/android.view.View[34]")
	@ElementDescription("我的(个人中心)")
	public MobileElement personCenter;

}
