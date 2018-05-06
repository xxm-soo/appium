package com.sunshine.objects;


import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 引导页面类
 * @author sigua
 *
 */
public class GuidePageObjects {

	@AndroidFindBy(className="android.widget.ImageView")
	@ElementDescription("引导页面整个图片元素")
	public MobileElement pageview;
	
	//com.sun309.cup.health:id/ts_coming
	//com.sun309.cup.health:id/gj
	//com.sun309.cup.health:id/f7
	//@AndroidFindBy(className="android.widget.Button")
	//@AndroidFindBy(id="com.sun309.cup.health:id/f7")
	@AndroidFindBy(xpath="//android.widget.RelativeLayout/android.widget.FrameLayout[contains(@resource-id,'com.sun309.cup.health:id')]")
	@ElementDescription("立即体验按钮")
	public MobileElement btn;
}
