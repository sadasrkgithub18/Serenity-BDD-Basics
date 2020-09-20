package com.naveen.testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;


@RunWith(SerenityRunner.class)
public class LoginTestWebEleFacade extends PageObject
{
	
  @Managed(driver = "chrome")	
	
  WebDriver driver;
  
  @FindBy(name="q")
  WebElement googleSearch;
	
  @Title("Executing the Login test with page object class")
  @Test	
  public void doLogin()
  {
	  open();
	  
	  System.out.println(getTitle());
	  //driver.get("https://www.google.com");
	 // getDriver().findElement(By.name("q")).sendKeys("Serenity BDD");
	  
	  //find(By.name("q")).sendKeys("Serenity BDD");
	  
	 // $(By.xpath("//*[@name='q']")).sendKeys("Serenity BDD");
  
      // typeInto($("//*[@name='q']"), "Serenity BDD");  
       
      // typeInto(googleSearch, "Serenity BDD");  
	  WebElementFacade text= find(By.name("q"));
      //text.sendKeys("Serenity BDD");
       
      text.typeAndEnter("Serenity BDD");
  }
  
  
}
