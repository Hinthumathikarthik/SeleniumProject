package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
//1.Switch to frame --->Automation:
		driver.switchTo().frame(1);
		WebElement automation = driver.findElement(By.xpath("//h2[text()='Automation']"));
		System.out.println(automation.getText());
		
//2.switch to frame--->CoreJava:
		driver.switchTo().frame("Core Java");
		WebElement corejava = driver.findElement(By.xpath("//h4[text()='Core Java']"));
		System.out.println(corejava.getText());
		
//3.switch to frame--->OOPS:
		driver.switchTo().frame("OOPS");
		WebElement OOPS = driver.findElement(By.xpath("//p[text()='1.1 OOPS']"));
		System.out.println(OOPS.getText());
		
//frame2[switch frame2 name in frame1 name]:
		driver.switchTo().parentFrame();
		System.out.println(corejava.getText());
		
//frame1[printing frame 1 name in console]
		driver.switchTo().parentFrame();
		System.out.println(automation.getText());
		
//main window--->if any parent frame is not present:
		driver.switchTo().parentFrame();
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
		System.out.println(para.getText());
		
	}}
