package com.naveen.actionsapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class RightClick extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void contextClicktest()
	{
		open();
		// https://deluxe-menu.com/popup-mode-sample.html
		
		withAction().contextClick($("//p[contains(text(),'Click the image to show the menu')]")).perform();
		
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
