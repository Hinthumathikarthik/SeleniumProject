package org.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling{
	
 public static void main(String[]args)  {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		
//finding the locator for textbox and entering the values:
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("Vivo v30",Keys.ENTER);
		
        WebElement btnmobphone = driver.findElement(By.xpath("//span[text()='Vivo V30 5G Smartphone, 8GB RAM 128GB Storage, Andaman Blue']"));
        btnmobphone.click();
        WebElement btnmobphone1 = driver.findElement(By.xpath("//span[text()='Vivo V30 5G Smartphone (Classic Black, 8GB RAM, 256GB Storage)']"));
        btnmobphone1.click();
       
 // to get the parent window-->getwindowhandle()
        String parwindowId = driver.getWindowHandle();
		System.out.println(parwindowId);
		
//to get all the opened windowid-->getwindowhandles()
		Set<String> allopenedId = driver.getWindowHandles();	
		System.out.println(allopenedId);
		
//peforming multiple windows and in second selected mobile we r performing add to cart button:
		List<String>li=new ArrayList<String>();
		li.addAll(allopenedId);
		String X =li.get(2);
		
		driver.switchTo().window(X);
		
//second selected mobile we r adding in cart:
		WebElement addcartbtn = driver.findElement(By.id("add-to-cart-button"));
		addcartbtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 }}