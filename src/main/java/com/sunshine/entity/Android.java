package com.sunshine.entity;

public class Android {
	/**
	 * 安卓设备ID顶顶顶
	 */
	private String deviceID;

	/**
	 * 安卓类型 adb -s deviceID shell getprop ro.product.model
	 */
	private String model;

	/**
	 * 安卓品牌 adb -s deviceID shell getprop ro.product.brand
	 */
	private String brand;

	/**
	 * 安卓系统版本 adb -s deviceID shell getprop ro.build.version.release
	 */
	private String osVersion;

	/**
	 * 安卓系统api版本adb -s deviceID shell getprop ro.build.version.sdk
	 */
	private String apiLevel;

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getApiLevel() {
		return apiLevel;
	}

	public void setApiLevel(String apiLevel) {
		this.apiLevel = apiLevel;
	}

}
