package com.naveen.alertsAndWindows;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class HandlingAlertTest extends PageObject
{
	@Managed
	WebDriver driver;
	
	@Test
	public void alertTest()
	{
		open();
		// https://mail.rediff.com/cgi-bin/login.cgi
		
		$("//input[@name='proceed']").click();
		
		Alert alert = getAlert();
		System.out.println(alert.getText());
		alert.accept();
		
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
