package com.codistan.qaclass1.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassMaven03 {
	
	@Test
	public void amazonTest() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shukhrat\\Documents\\ChromeDriver\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("fidget" + Keys.ENTER);
		driver.close();
	}
	
	

}
