package com.Cybertek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HellowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Administrator/Documents/"
				+ "selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url="https://learn.cybertekschool.com";
	}

}
