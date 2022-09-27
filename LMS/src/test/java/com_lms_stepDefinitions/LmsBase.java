package com_lms_stepDefinitions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class LmsBase {

	public static WebDriver driver;
	public static Properties prop;

	
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public LmsBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver","C:\\Archana\\newest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(com_lms_utilities.LmsUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(com_lms_utilities.LmsUtil.IMPLICIT_WAIT));

		
	}
	public static void openUrl(String url)
	{
		driver.get(url);
	}
}

