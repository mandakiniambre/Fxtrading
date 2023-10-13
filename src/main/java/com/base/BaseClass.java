package com.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 public WebDriver driver;
 public void lunchbrowser() {
	 driver=new ChromeDriver();
	 
	Properties m=new Properties();
	driver.get(m.getProperty("weburl"));
 }
}
