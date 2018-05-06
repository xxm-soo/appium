package com.sunshine.objects;

import com.sunshine.annotation.values.ElementDescription;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
/**
 * 订单详情页
 */
public class OrderDetailPageObjects {
	
	@AndroidFindBy(xpath="//section[2]/p[2]/b/text()[1]")
	@ElementDescription("H5订单状态")
	public MobileElement orderStatus;
	
	@AndroidFindBy(id="refundBtn")
	@ElementDescription("H5取消预约")
	public MobileElement btnCancel;
	
	@AndroidFindBy(className="but-save col but-down")
	@ElementDescription("H5知道了")
	public MobileElement btnKnow;
	

	
	
	//*******是否取消挂号订单*******//
	@AndroidFindBy(xpath="//div[contains(@id,'dialog')]")
	@ElementDescription("H5取消订单对话框")
	public MobileElement dialog;
	
	
	@AndroidFindBy(className="but-save col btn2 btn2-ok modal-but-save-reset")
	@ElementDescription("H5确定")
	public MobileElement btnOk;
	
	@AndroidFindBy(className="but-save col but-cancel btn2 btn2-cancel modal-but-save-reset")
	@ElementDescription("H5取消")
	public MobileElement btnCancle;

	//*******确定取消后的弹窗*******//
	@AndroidFindBy(className="center")
	@ElementDescription("H5您请求已受理,请稍后查看结果.")
	public MobileElement isOkContent;
	
	@AndroidFindBy(className="but-save col btn2 btn2-ok modal-but-save-reset btn2-block")
	@ElementDescription("取消订单按确定")
	public MobileElement isOk;
	
}
