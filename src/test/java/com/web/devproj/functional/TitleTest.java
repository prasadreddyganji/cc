package com.web.devproj.functional;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.junit.Test;

public class TitleTest {
	@Test
	public void testTtile() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/sarthak/Downloads/DevProject-main/Driver/geckodriver");
		FirefoxOptions opts = new FirefoxOptions();
		opts.setHeadless(true);
		WebDriver driver= new FirefoxDriver(opts);
		String baseUrl = "http://localhost:5050/devproj/index.html";
		driver.get(baseUrl);
		assertEquals("CurrencyConverter", driver.getTitle());
		driver.close();
		
	}
	

}
