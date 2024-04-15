package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[]args) throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		
//to load URL of the WebPage:(to()--m)		
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().to("https://www.snapdeal.com/");
		
		Thread.sleep(2000);
		
// to return back to previous page:
		driver.navigate().back();

//to move forward:
		driver.navigate().forward();
		
//to refresh the webpage:
		driver.navigate().refresh();
		
	}}
