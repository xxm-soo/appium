package com.sunshine.appium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.sunshine.entity.Android;
import com.sunshine.utils.Proper;


public class ParallelThread {
	private DeviceManager deviceManager;

	public ParallelThread() {
		deviceManager = new DeviceManager();
	}

	public boolean trigerTest() {

		return true;

	}

	public boolean parallelExecute() throws IOException {

		File file = new File(Proper.userDir + "/logs/");

		boolean result;

		if (!file.exists()) {
			System.out.println("Make dir:" + "logs");
			file.mkdir();
			result = true;
		}
		
		ArrayList<Android> Androids = deviceManager.getAndroids();
		if(Androids.size()==0) {
			System.out.println("No devices connected");
			System.exit(0);
			
		}
		System.out.println("***************************************************\n");
		System.out.println("Total Number of devices detected::" + Androids.size() + "\n");
		for (Android android : Androids) {
			System.out.println(android.getDeviceID());
		}
		System.out.println("***************************************************\n");
		System.out.println("Starting running tests in threads");
				
		return true;
		
		
	}
}
