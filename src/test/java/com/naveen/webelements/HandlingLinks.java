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
public class HandlingLinks extends PageObject
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
		
		/*
		 * List<WebElementFacade> links = findAll(By.tagName("a"));
		 * 
		 * System.out.println("Total no.of in links are: "+links.size());
		 * 
		 * System.out.println(links.get(9).getText());
		 * 
		 * 
		 * for(WebElementFacade link : links) {
		 * System.out.println("Link text is: "+link.getText()+" ====== Printing URL "
		 * +link.getAttribute("href")); }
		 */
		
		System.out.println("=================================");
		
		
		
		
		/*
		 * WebElementFacade section = $("//div[@class='other-projects']");
		 * 
		 * List<WebElementFacade> sectionLinks = section.thenFindAll(By.tagName("a"));
		 * 
		 * System.out.println("Total no.of in links are: "+sectionLinks.size());
		 * 
		 * for(WebElementFacade secLink : sectionLinks) {
		 * System.out.println("Link text is: "+secLink.getText()+" ====== Printing URL "
		 * +secLink.getAttribute("href")); }
		 */
		
		
		
		System.out.println("=================================");
		
		WebElementFacade dropDown = find(By.id("searchLanguage"));
		List<WebElementFacade> dropVales = dropDown.thenFindAll(By.tagName("option"));
		
		System.out.println("Total no.of in links are: "+dropVales.size());
		
		for(WebElementFacade link : dropVales) 
		{
			System.out.println(link.getAttribute("lang"));
	    }
			 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
