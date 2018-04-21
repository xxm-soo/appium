package com.sunshine.appium;

import java.io.IOException;
import java.util.ArrayList;

import com.sunshine.android.AndroidConfiguration;
import com.sunshine.entity.Android;



public class DeviceManager {
	private Android android;
	public AndroidConfiguration androidDeviceConfig;
	
	public DeviceManager() {
		androidDeviceConfig = new AndroidConfiguration();
	}
	
	public ArrayList<Android> getAndroids() throws IOException {
		return androidDeviceConfig.getDevices();
	}
	

}
