package com.sunshine.objects;

import org.openqa.selenium.support.CacheLookup;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class LoginPageObjects {
	
	@CacheLookup
	@AndroidFindBy(id="useraccount")
	@ElementDescription("用户账号")
	public MobileElement username;
	
	
	@CacheLookup
	@AndroidFindBy(id="password")
	@ElementDescription("用户密码")
	public MobileElement password;
	
	@CacheLookup
	@AndroidFindBy(className="android.widget.Button")
	@ElementDescription("登录按钮")
	public MobileElement sign_btn;

}
