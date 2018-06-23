package com.sel.pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample002 {

	public static void main(String[] args) throws InterruptedException, AWTException   {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com");
		driver.findElement(By.id("menu-item-374")).click();	
		Thread.sleep(20000);
		driver.findElement(By.name("first_name")).sendKeys("smith");
		driver.findElement(By.name("last_name")).sendKeys("jack");
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
		driver.findElement(By.id("profile_pic_10")).click();
		
		StringSelection fn = new StringSelection("D:\\notes.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fn, null);
		Robot fu = new Robot();
		fu.keyPress(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
