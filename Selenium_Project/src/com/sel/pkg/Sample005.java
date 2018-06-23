package com.sel.pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/datepicker/");
		driver.findElement(By.id("datepicker1")).click();

		// List<WebElement> sel_year =driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[2]"));
		for(int i=0;i<=12;i++)
		{
		String sel_month =driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
		if(sel_month.equalsIgnoreCase("november"))
		{
		List<WebElement> dates =driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));


		for(WebElement ra:dates)
		{
			String val=ra.getText();
			if(val.equalsIgnoreCase("18"))
			{
				ra.click();
				break;
			}
		}
		break;
		}
		else
		{
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();
		}
	}

	}
}
