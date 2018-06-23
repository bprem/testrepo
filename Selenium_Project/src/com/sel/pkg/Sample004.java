package com.sel.pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample004 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com");
		driver.findElement(By.id("menu-item-374")).click();	
		Thread.sleep(20000);
		driver.findElement(By.name("first_name")).sendKeys("smith");
		driver.findElement(By.name("last_name")).sendKeys("jack");
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement ra:radios)
		{
			String val=ra.getAttribute("value");
			if(val.equalsIgnoreCase("married"))
			{
				ra.click();
				break;
			}
		}
		List<WebElement> chkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement cb:chkbox)
		{
			String val=cb.getAttribute("value");
			if(val.equalsIgnoreCase("reading") || val.equalsIgnoreCase("cricket "))
			{
				cb.click();
				
			}
		}
		WebElement cou = driver.findElement(By.name("dropdown_7"));
		Select cou_select = new Select(cou);
		cou_select.selectByIndex(3);
		WebElement mon = driver.findElement(By.id("mm_date_8"));
		Select mon_select = new Select(mon);
		mon_select.selectByVisibleText("5");
		WebElement day = driver.findElement(By.id("dd_date_8"));
		Select day_select = new Select(day);
		day_select.selectByValue("1");
		driver.findElement(By.name("phone_9")).sendKeys("6576453890");
		driver.findElement(By.id("username")).sendKeys("jack5");
		driver.findElement(By.id("email_1")).sendKeys("nike@outlook.com");
		driver.findElement(By.id("description")).sendKeys("abcdefgh");
		driver.findElement(By.id("password_2")).sendKeys("1234567z");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("1234567z");	
	}

}
