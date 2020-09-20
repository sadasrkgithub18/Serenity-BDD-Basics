package com.naveen.webelements;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class HandlinDropDowns extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void webElementTest()
	{
		open();
		// find(By.id("searchLanguage")).sendKeys("Eesti");
		
		// find(By.id("searchLanguage")).selectByVisibleText("Eesti");
		
	    // find(By.id("searchLanguage")).selectByValue("hi");
		
		List<WebElementFacade> values = findAll(By.tagName("option"));
		
		System.out.println("Total values in drop don are: "+values.size());
		
		System.out.println(values.get(9).getText());
		
		
		for(WebElementFacade val : values)
		{
			System.out.println(val.getAttribute("lang"));
		}
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
