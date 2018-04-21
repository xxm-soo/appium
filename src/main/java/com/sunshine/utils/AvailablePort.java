package com.sunshine.utils;

import java.net.ServerSocket;

/**
 * 在appium Server运行时随机生产端口类
 * 
 * @author Administrator
 *
 */
public class AvailablePort {

	public int getPort() throws Exception {
		ServerSocket socket = new ServerSocket(0);
		socket.setReuseAddress(true);
		int port = socket.getLocalPort();
		socket.close();
		return port;
	}

}
