package com.naveen.alertsAndWindows;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class HandlingIFrames extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void iframeTest()
	{
		open();
		// https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_regexp
		
		getDriver().switchTo().frame("iframeResult");
		
		$("/html/body/button").click();
		
		getDriver().switchTo().defaultContent();
		
		List<WebElementFacade> frames = findAll(By.tagName("iframe"));
		
		for(WebElementFacade frame : frames)
		{
			System.out.println(frame.getAttribute("id"));	
		}
		
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
