package com.sunshine.android;

import java.io.IOException;
import java.util.ArrayList;

import com.sunshine.entity.Android;
import com.sunshine.utils.CommandPrompt;



public class AndroidConfiguration {
	private ArrayList<Android> devices;
	private CommandPrompt cmd;

	public AndroidConfiguration() {
		cmd = new CommandPrompt();
	}

	public void startADB() throws IOException {
		String outPut = cmd.runCommand("adb start-server");
		String[] lines = outPut.split("/n");

		if (lines[0].contains("不是内部或外部命令")) {
			System.out.println("adb 环境变量没有设置");
		} else {
			System.out.println("adb 服务启动成功");
		}
	}

	public void stopADB() throws IOException {
		cmd.runCommand("adb kill-server");
	}

	public ArrayList<Android> getDevices() throws IOException {
		devices = new ArrayList<Android>();
		startADB();
		String outPut = cmd.runCommand("adb devices");
		System.out.println(outPut);
		String[] lines = outPut.split("/n");

		if (lines.length <= 1) {
			startADB();
		} else {
			for (int i = 1; i < lines.length; i++) {

				// s+:将每行的回车符、制表符、空格等用""替换
				lines[i] = lines[i].replaceAll("\\s+", "");

				if (lines[i].contains("device")) {
					// 去掉device
					lines[i] = lines[i].replaceAll("device", "");

					String deviceID = lines[i];
					Android android = new Android();

					android.setDeviceID(deviceID);
					android.setModel(cmd.runCommand("adb -s " + deviceID + " shell getprop ro.product.model"));
					android.setBrand(cmd.runCommand(" adb -s " + deviceID + " shell getprop ro.product.brand"));
					android.setOsVersion(
							cmd.runCommand("adb -s " + deviceID + " shell getprop ro.build.version.release"));
					android.setApiLevel(cmd.runCommand("adb -s " + deviceID + " shell getprop ro.build.version.sdk"));
					devices.add(android);
				}

			}
		}
		return devices;

	}

}
