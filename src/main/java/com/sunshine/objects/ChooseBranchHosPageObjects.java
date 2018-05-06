package com.sunshine.objects;

import org.openqa.selenium.support.FindBy;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 选择分院PAGE
 * @author sigua
 *
 */
public class ChooseBranchHosPageObjects {
	
	@FindBy(className="info-list")
	@ElementDescription("分院元素加载")
	public MobileElement hospitalBranchModel;
	
	@FindBy(xpath="//section[@class='info-list']/a[1]")
	@ElementDescription("第一个分院")
	public  MobileElement hospitalBranchName1;
	
	@FindBy(xpath="//section[@class='info-list']/a[2]")
	@ElementDescription("第二个分院")
	public  MobileElement hospitalBranchName2;
	
	
	
	
}
