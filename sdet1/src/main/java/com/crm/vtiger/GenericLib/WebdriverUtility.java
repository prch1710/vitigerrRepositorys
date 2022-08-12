package com.crm.vtiger.GenericLib;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	/**
	 * wait for page to load before identifying any sychronized element i DOM
	 * @author Priyanka
	 */
	
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	/**
	 * After every action it will for wait next action to perfrom
	 * @Author Priyanka
	 */
	
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
	}
	/**
	 * used to wait for element to be Clickable in GUI and check for specipic element for every 500milliseconds
	 * @param driver
	 * @param Element
	 * Author Priyanka
	 */
	
	public void waitForElementToBeClickable(WebDriver driver,WebElement Element)

	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	
	/**
	 * 
	 * @param driver
	 * @param Element
	 * @param pollingTime
	 */
	public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime) 
	{
		FluentWait<T> wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(Element));
		
	}
	/**
	 * used to switch to any window based on window title
	 * Author Priyanka
	 */
	
	public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	{
		Set<String> allId=driver.getWindowHandles();
		Iterator<String> it=allId.iterator();
		while(it.hasNext())
		{
			String wid=it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(PartialWindowTitle)) 
			{
				break;
			}
		}
	}
	
	/**used to  Switch to alertwindow and accept the poppup(click on ok)
	 * Author Priyanka
	 * 
	 */
	public void alertPopPupaccept(WebDriver driver) 
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
	
	/**
	 * used to Switch to AlertWindow and  dismiss the poppup(click on cancle)
	 * Author Priyanka
	 * @param driver
	 */
	public void alertPopPupDissmis(WebDriver driver) 
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	
	/**used to switch to frame window base to index
	 * @param driver
	 * @param index
	 * @author Priyanka
	 */
	public void switchToFrame(WebDriver driver,int Index)
	{
		driver.switchTo().frame(Index);
	}
	
	/**use to switch to frame window based on id or name
	 * @param driver
	 * @param id_name_attribute
	 * @author PRIYANKA
	 * 
	 */
	
	public void switchToFrame(WebDriver driver,String id_name_attribute)
	{
		driver.switchTo().frame(id_name_attribute);
	}
	
	/**
	 * used to select the value from the dropdown based on index
	 * @param index
	 * @author PRIYANKA
	 */
	
	public void  select(WebElement element, int index)
	
	{
		Select s=new Select(element);
		s.selectByIndex(index);
		
	}
	/**
	 * used to select the value from the dropdown based on text
	 * @param text
	 * @author priyaka
	 */
	
	public void select(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * used to place mouse cursor on  specific element
	 * @author priyanka
	 * @param driver
	 * @param element
	 */
	public void mouseOveronElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * used to rightclick on specipic element
	 * @param driver
	 * @param element
	 * @author PRIYANKA
	 */
	public void rigthClickonElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
}
