package com.naveen.actionsapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class SliderTest extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void sliderTest()
	{
		open();
		// https://jqueryui.com/resources/demos/slider/default.html
		
		int size = $("//div[@id='slider']").getSize().width/2;
		withAction().dragAndDropBy($("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"), size, 0).perform();
		
		try 
		{
			Thread.sleep(3000);
		} 
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		withAction().dragAndDropBy($("//*[@id=\"slider\"]/span"), -size, 0).perform();
		
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
