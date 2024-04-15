package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank {
	
public static void main(String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/ ");
		driver.manage().window().maximize();
		
//enetering the customer id:
		WebElement idtxt = driver.findElement(By.name("fldLoginUserId"));
        idtxt.sendKeys("12345678");
        
//to click the continue button:  
        WebElement btncontinue = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		btncontinue.click();
		
		
		
		
		
}}
