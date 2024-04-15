package org.selenium;

import java.io.File;  
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Fileoperation	{ 


	public static void main(String[]args) throws IOException   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://Facebook.com/");
		driver.manage().window().maximize();
		
//type casting
		TakesScreenshot Screenshot=(TakesScreenshot) driver;
		File file= Screenshot .getScreenshotAs(OutputType.FILE);
	
		 
//from temp location saving the screenshot in our expected location:
		 
		File destFile=new File("C:\\Users\\Hinthumathi\\eclipse-workspace\\SeleniumProject\\src\\facebooklogin.png");
		FileUtils.copyFile(file, destFile);	
		
	}}		
		
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
