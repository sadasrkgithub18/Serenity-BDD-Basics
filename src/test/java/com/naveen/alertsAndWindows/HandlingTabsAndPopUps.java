package com.naveen.alertsAndWindows;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class HandlingTabsAndPopUps extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void tabsAndPopupsTest()
	{
		open();
		// http://www.way2automation.com/
		
		$("//a[contains(text(),'MEMBER LOGIN')]").click();
		
		ArrayList<String> newTab = new ArrayList<String> (getDriver().getWindowHandles());
		
		getDriver().switchTo().window(newTab.get(1));
		
		$("//input[@id='user_email']").sendKeys("trainer@way2automation.com");
		
		System.out.println("Second window titile is: "+getTitle());
		getDriver().close();
		getDriver().switchTo().window(newTab.get(0));
		System.out.println("First window titile is: "+getTitle());
		getDriver().close();
		
		try 
		{
			Thread.sleep(3000);
		} 
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
}
