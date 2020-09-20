package com.naveen.alertsAndWindows;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.components.HtmlTable;

@RunWith(SerenityRunner.class)
public class HandlingWebTables extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void javaScriptTest()
	{
		open();
		// https://money.rediff.com/gainers/bse/daily/groupall
		
		
		/*
		 * WebElementFacade table = $("//*[@id=\"leftcontainer\"]/table");
		 * List<WebElementFacade> rows = table.thenFindAll(By.tagName("tr"));
		 * 
		 * System.out.println(rows.size());
		 * 
		 * for(WebElementFacade row : rows) { System.out.println(row.getText()); }
		 * 
		 * 
		 * WebElementFacade row1 = $("//div[@id='leftcontainer']//tbody//tr[1]");
		 * List<WebElementFacade> cols = row1.thenFindAll(By.tagName("td"));
		 * System.out.println("Cols size is: "+cols.size());
		 */
		
		
		
		HtmlTable table = new HtmlTable($("//table[@class='dataTable']"));
		
		List<String> headers = table.getHeadings();
		for(String header : headers)
		{
			System.out.println(header);
		}
		
		List<WebElement> rows = table.getRowElements();
		for(WebElement row : rows)
		{
			System.out.println(row.getText());
		}
		
		System.out.println("Total rows are: "+rows.size());
		
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
