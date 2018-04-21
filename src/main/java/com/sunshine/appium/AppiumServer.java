package com.sunshine.appium;

import java.io.File;

import com.sunshine.entity.Android;
import com.sunshine.utils.AvailablePort;
import com.sunshine.utils.Proper;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


/**
 * 
 * @author Administrator
 *
 */
public class AppiumServer {
	public Android android;
	public AvailablePort availablePort;
	
	private static ThreadLocal<AppiumDriverLocalService> appiumDriverLocalService = new ThreadLocal<>();
	private static AppiumDriverLocalService getServer() {
		
		return appiumDriverLocalService.get();
	}
	private static void setServer(AppiumDriverLocalService server) {

		appiumDriverLocalService.set(server);
	}

	public AppiumServer() {
		availablePort = new AvailablePort();
	}

	private void startAppiumServerForAndroid() throws Exception{
		
		AppiumDriverLocalService appiumDriverLocalService;
		
		AppiumServiceBuilder appiumServiceBuilder =new AppiumServiceBuilder()
				.withAppiumJS(Proper.findCustomNode())
				.withArgument(GeneralServerFlag.LOG_LEVEL,"info").withLogFile(new File(Proper.userDir+"/target/appiumlogs/"+android.getDeviceID()+".log"))
				.withArgument(AndroidServerFlag.CHROME_DRIVER_PORT,Integer.toString(availablePort.getPort()))
				.withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER,Integer.toString(availablePort.getPort()))
				.withArgument(AndroidServerFlag.SUPPRESS_ADB_KILL_SERVER)
				.withArgument(AndroidServerFlag.SELENDROID_PORT,Integer.toString(availablePort.getPort()))
				.withIPAddress("127.0.0.1")
				.usingPort(availablePort.getPort());
		
		appiumDriverLocalService =appiumServiceBuilder.build();
		appiumDriverLocalService.start();
		setServer(appiumDriverLocalService);
		
	}
	
	
	private void startAppiumServerForIOS(){
		
		/*AppiumDriverLocalService appiumDriverLocalService;
		
		AppiumServiceBuilder appiumServiceBuilder =new AppiumServiceBuilder()
				.withAppiumJS(Proper.findCustomNode())
				.withArgument(GeneralServerFlag.LOG_LEVEL,"info").withLogFile(new File(Proper.userDir+"/target/appiumlogs/"+android.getDeviceID()+".log"))
				.withArgument(webKitProxy,Integer.toString(availablePort.getPort()))
				.withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER,Integer.toString(availablePort.getPort()))
				.withArgument(AndroidServerFlag.SUPPRESS_ADB_KILL_SERVER)
				.withArgument(AndroidServerFlag.SELENDROID_PORT,Integer.toString(availablePort.getPort()))
				.withIPAddress("127.0.0.1")
				.usingPort(availablePort.getPort());
		
		appiumDriverLocalService =appiumServiceBuilder.build();
		appiumDriverLocalService.start();
		setServer(appiumDriverLocalService);*/
		
	}

}
