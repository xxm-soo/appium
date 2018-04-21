package com.sunshine.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Platform;


public class Proper {

	private static Properties properties;

	public static String userDir = System.getProperty("user.dir");

	private static void getCustomNodeJS() throws Exception {
		File file = new File(userDir + "/custom_node_path.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		fileInputStream.close();
	}

	public static File findCustomNode() {

		Platform platform = Platform.getCurrent();

		if (platform == Platform.WINDOWS) {
			return new File(String.valueOf(properties.getProperty("path.to.custom.node.win")));
		}
		if (platform == Platform.MAC) {
			return new File(String.valueOf(properties.getProperty("path.to.custom.node.macos")));
		}

		return new File(String.valueOf(properties.getProperty("path.to.custom.node.linux")));
	}

}
