package com.naveen.actionsapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MouseHoverActions extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void mouseHoverTest()
	{
		open();
		// https://www.mindqsystems.com/trainings-in-mindq-institute
		withAction().moveToElement($("//ul[@id='top-menu']//a[contains(text(),'Trainings')]")).perform();
		$("//ul[@id='top-menu']//a[contains(text(),'Selenium Live Project')]").click();
		
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
