package com.mindtree.Tideclass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tide1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
		driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> iterator=s1.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("krunal");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("krunalhallur@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hallur@321");
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		
		
		
		
		
	}

}
