package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
public static void main(String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
	
//entering username:	
	    WebElement txtusername = driver.findElement(By.name("username"));
	    txtusername.sendKeys("Hinthumathi");
	    
//entering password:	    
	    WebElement txtpassword = driver.findElement(By.name("password"));
	    txtpassword.sendKeys("Hinthu@3456");
	    
//clicking login button:	    
	    WebElement btnlogin = driver.findElement(By.xpath("//div[text()='Log in']"));
	    btnlogin.click();
	
	
	

}}
