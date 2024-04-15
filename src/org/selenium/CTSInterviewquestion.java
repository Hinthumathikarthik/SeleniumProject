package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CTSInterviewquestion {
	
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
//clicking Interview questions:
		WebElement button = driver.findElement(By.id("heading20"));
		button.click();	
		
//using JavaScriptExecutor and clicking CTS Interview Questions:(executescript()-->m)
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		WebElement button1 = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		executor.executeScript("arguments[0].click()", button1);
	
	
	
	
	
	
	}}
