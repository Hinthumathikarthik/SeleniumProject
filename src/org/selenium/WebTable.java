package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	 public static void main(String[]args)  {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			driver.manage().window().maximize();
			
			
// finding the locator for the whole table:
			WebElement table = driver.findElement(By.id("customers"));		
	        System.out.println(table.getText());
	        
//Finding Locator for rows:
// to get all the rows and finding the size:	        
	        
	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        System.out.println(rows.size());
	        
//Printing the particular second row :
	        WebElement secondrow = rows.get(1);
	        System.out.println(secondrow.getText());
	      
//printing all the rows:
	        for(int i=0;i<rows.size();i++) {
	        	
	        WebElement w = rows.get(1)	;
	        System.out.println(w.getText());	
	        	
	        	
	        	
	        }
	 }}
	        
	        

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

