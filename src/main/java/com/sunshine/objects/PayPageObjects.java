package com.sunshine.objects;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 支付页
 * @author sigua
 *
 */
public class PayPageObjects {

	@AndroidFindBy(id="payBtn")
	@ElementDescription("确认支付")
	public MobileElement payBtn;
	
	@AndroidFindBy(id="inputBoxContainerFirst")
	@ElementDescription("输入支付密码")
	public MobileElement payPassword;
	
	
}
