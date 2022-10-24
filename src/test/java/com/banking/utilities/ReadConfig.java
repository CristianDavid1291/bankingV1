package com.banking.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {
		try {
			prop = new Properties();
			FileInputStream filIn = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
			prop.load(filIn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getApplicationUrl() {
		String url = prop.getProperty("url");
		return url;
	}

	public String getUser() {
		return prop.getProperty("user");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}

}
