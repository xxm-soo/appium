package com.sunshine.objects;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * 确认订单PAGE
 * @author sigua
 *
 */
public class ConfirmRegInfoPageObjects {
	
	@AndroidFindBy(xpath="//section[@class='list list-head']/a[@patientname='谢显明']")
	@ElementDescription("就诊人")
	public MobileElement patientName;
	
	@AndroidFindBy(xpath="//section[@class='list list-head']/a[@cardno='999']")
	@ElementDescription("诊疗卡")
	public MobileElement cardNo;
	
	@AndroidFindBy(id="limitQrCodePay")
	@ElementDescription("小额支付")
	public MobileElement limitQrCodePay; 
	
	@AndroidFindBy(id="medicarePayment")
	@ElementDescription("医保支付")
	public MobileElement medicarePayment;
	
	@AndroidFindBy(id="healthWallet")
	@ElementDescription("健康钱包")
	public MobileElement healthWallet;
	
	
	@AndroidFindBy(id="Ret-var61")
	@ElementDescription("确认挂号")
	public MobileElement btnSave;

}
