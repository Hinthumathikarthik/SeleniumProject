package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {
	public static void main(String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
		
        //switching to frame:
		
		//driver.switchTo().frame(1);
		//WebElement img = driver.findElement(By.xpath("//div[@class='whyLearn']"));
		//img.click();
		
		//return the window:
		driver.switchTo().defaultContent();
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
		String text = element.getText();
		System.out.println(text);
	}}	

