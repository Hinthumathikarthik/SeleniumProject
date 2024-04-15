package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com ");
		driver.manage().window().maximize();
		
//Email textbox:
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("greenstechchennaiomr@gmail.com");
		
//password textbox:
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Learn@123");
		
//login button:
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnlogin.click();
		
	    Thread.sleep(2000);
	    
//Type casting--->convert one interface to another interface
	    JavascriptExecutor executor= (JavascriptExecutor) driver;
	    WebElement InkHotel = driver.findElement(By.xpath("//h3[text()='Hotel Booking']"));
	    InkHotel.click();
	    
	    
//Entering the checkInDate for hotel Booking:
	    WebElement txtcheckInDate = driver.findElement(By.name("check_in"));
	    executor.executeScript("arguments[0].setAttribute('value','2024-04-09')",txtcheckInDate);
	   
//Entering the checkoutDate for Hotel Booking:
	    WebElement txtcheckOutDate = driver.findElement(By.name("check_out"));	
	    executor.executeScript("arguments[0].setAttribute('value','2024-04-16')", txtcheckOutDate);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}}
