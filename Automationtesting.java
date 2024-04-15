package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationtesting {
	
public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(" http://demo.automationtesting.in/Register.html");
	    
//FIRST NAME:	    
	    WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    txtfirstname.sendKeys("Hinthumathi");

//LAST NAME:	    
	    WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    txtlastname.sendKeys("V");
	    
//ADDRESS:	    
	    WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	    address.sendKeys(" No:5,5th Street,Periyar nagar,Irumbuliyur,West Tambaram");
	    
//EMAIL ID:	    
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("hindhumathi1999@gmail.com");
	    
//PHONE NO:	    
	    WebElement phoneno = driver.findElement(By.xpath("//input[@type='tel']"));
	    phoneno.sendKeys("9092546102");
	    
//GENDER:	    
	    WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']"));
	    gender.click();  
	    WebElement hobbies = driver.findElement(By.id("checkbox2"));
	    hobbies.click();
	    
//LANGUAGE:	(using javaScript and clicking the button) 
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   WebElement txtbox = driver.findElement(By.id("msdd"));
	   js.executeScript("arguments[0].click()", txtbox);
	   WebElement btneng = driver.findElement(By.xpath("//a[text()='Catalan']"));
	   js.executeScript("arguments[0].click()", btneng);
	   
//SKILLS:	   
	   WebElement btnskills = driver.findElement(By.id("Skills"));
	   Select s4=new Select(btnskills);
	   s4.selectByIndex(2);
	   
//COUNTR/Y:
	   JavascriptExecutor js1=(JavascriptExecutor) driver;
       WebElement countbtn = driver.findElement(By.id("countries"));
       js1.executeScript("arguments[0].click()", countbtn);
       WebElement btncountry = driver.findElement(By.xpath("//span[@role='combobox']"));
	   js1.executeScript("arguments[0].click()", btncountry);
	   WebElement indiabtn = driver.findElement(By.xpath("//option[text()='India']"));
       js1.executeScript("arguments[0].click()",indiabtn);
	   
//YEAR:	   
	   WebElement year = driver.findElement(By.id("yearbox"));
	   Select s1=new Select(year);
	   s1.selectByIndex(19);
      
//MONTH:      
      WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
      Select s2=new Select(month);
      s2.selectByIndex(5);

//DATE:      
      WebElement date = driver.findElement(By.id("daybox"));
	  Select s3=new Select(date);
	  s3.selectByIndex(23);
	  
//PASSWORD
	  WebElement password = driver.findElement(By.id("firstpassword"));
	  password.sendKeys("Hinthu#6575");
	  
//CONFIRM PASSWORD:
	  WebElement password1 = driver.findElement(By.id("secondpassword"));
	  password1.sendKeys("Hinthu#6575");

//BUTTON SUBMIT:	  
	  WebElement btnsubmit = driver.findElement(By.id("submitbtn"));
	  btnsubmit.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
     

	    
	   
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	

}}
