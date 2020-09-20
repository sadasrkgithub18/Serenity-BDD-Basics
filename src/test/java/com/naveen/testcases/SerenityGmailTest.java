package com.naveen.testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Duration;

@RunWith(SerenityRunner.class)
public class SerenityGmailTest extends PageObject
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
	  System.out.println(getImplicitWaitTimeout());
	  System.out.println(getWaitForTimeout());
	  // setImplicitTimeout(10,SECONDS);
	  
	  
	  // System.out.println(getImplicitWaitTimeout());
	  // withTimeoutOf(Duration.ofSeconds(10)).find(By.id("identifierId")).type("sadasiva.kikkurru");
	  
	 //  waitForCondition().until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId"))).sendKeys("srk");
	  
	 // waitForCondition().until(ExpectedConditions.elementToBeClickable(By.id("identifierId"))).sendKeys("srk");
	  
	  waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).withMessage("Element was not found in 10Secs").until(ExpectedConditions.elementToBeClickable(By.id("identifierId"))).sendKeys("srk");
	  
	  find(By.id("identifierNext")).click();
	  find(By.name("password")).sendKeys("125785");
	  find(By.id("passwordNext")).click();
  }
  
  
}
