package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
FileInputStream fileinputstream;
	
	public static WebDriver driver;
	
	public Properties prop;
	
	public static String projectpath= System.getProperty("user.dir"); 
	
	 public void LaunchTheWeb() throws IOException
	 {
		 
		 
		 driver= new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		prop= new Properties();
		 fileinputstream = new FileInputStream(".\\src\\main\\resources\\property\\config.properties");
		  prop.load(fileinputstream);
		  
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get(prop.getProperty("weburl"));
	
 }
}
