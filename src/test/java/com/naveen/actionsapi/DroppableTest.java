package com.naveen.actionsapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class DroppableTest extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void droppableTest()
	{
		open();
		// https://jqueryui.com/resources/demos/droppable/default.html
		
		withAction().dragAndDrop($("//*[@id=\"draggable\"]/p"), $("//*[@id=\"droppable\"]")).perform();
		
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
