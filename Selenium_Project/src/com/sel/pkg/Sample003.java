package com.sel.pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");	
		driver.findElement(By.id("btnLogin")).click();		
		
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions mh = new Actions(driver);
		mh.moveToElement(pim).build().perform();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
	}

}
