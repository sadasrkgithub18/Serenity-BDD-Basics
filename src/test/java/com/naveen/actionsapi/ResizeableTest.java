package com.naveen.actionsapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class ResizeableTest extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void resizableTest()
	{
		open();
		// https://jqueryui.com/resources/demos/resizable/default.html
		
		withAction().dragAndDropBy($("//*[@id=\"resizable\"]/div[3]"), 400, 400).perform();
		
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
