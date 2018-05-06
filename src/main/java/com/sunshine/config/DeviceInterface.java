package com.sunshine.config;

import java.io.IOException;

import com.sunshine.pages.HomePage;
import com.sunshine.pages.LoginPage;


public interface DeviceInterface {
	
	public void login(LoginPage loginPage,String username,String password) throws IOException, InterruptedException;
	
	public void waitForHomePage(HomePage homePage);
	
	public void moveToLogOutScreen(HomePage homePage);
	
	public void writeContent ();

}
