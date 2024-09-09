package com.Basesuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver ;
	
	protected BaseClass() {
	}
	
	
	@BeforeSuite
	public void Setup() {
		driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);	
		driver.get("https://www.fitpeo.com/");
	}
	
	@AfterSuite
	public void TearDown() {
		driver.quit();	
	}

}
