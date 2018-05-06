package com.sunshine.objects;

import org.openqa.selenium.support.FindBy;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 选择科室PAGE
 * @author sigua
 *
 */
public class ChooseDeptPageObjects {
	

	@FindBy(id="deptList")
	@ElementDescription("科室列表")
	public MobileElement deptList;
	
	@FindBy(id="subDeptList")
	@ElementDescription("子科室列表")
	public MobileElement subDeptList;
	
	@AndroidFindBy(xpath="//div[id@='subDeptList']/a[@name='耳科']")
	@ElementDescription("耳科")
	public MobileElement subDeptName;
	
}
