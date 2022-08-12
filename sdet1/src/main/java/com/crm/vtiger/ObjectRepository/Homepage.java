package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericLib.WebdriverUtility;

public class Homepage {
	//initalization
	public  Homepage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	//declaration
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement oraganizationButton;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productsButton;
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement moremouseover;
	
	@FindBy(name="Campaigns")
	private WebElement campaings;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement singoutmouseover;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement singoutbutton;
	
	
	
	
	public WebElement getOraganizationButton() 
	{
		return oraganizationButton;
	}




	public WebElement getProductsButton() 
	{
		return productsButton;
	}




	public WebElement campaing() 
	{
		return moremouseover;
	}


	public WebElement getCampaings()
	{
		return campaings;
	}


	public WebElement getSingoutmouseover()
	{
		return singoutmouseover;
	}




	public WebElement getSingoutbutton() 
	{
		return singoutbutton;
	}




	public void oraganizationlink() 
	{
		oraganizationButton.click();
	}
	
	public void productLink()
	{
		productsButton.click();
	}
	
	 public void moreLink(WebDriver driver)
		{
			WebdriverUtility wlib=new WebdriverUtility();
			wlib.mouseOveronElement(driver,moremouseover);
		}
	
	
	public void campaingn()
	{
		campaings.click();
	}
	


public void singoutmouseover(WebDriver driver) 
{
	WebdriverUtility wlib=new WebdriverUtility();
	wlib.mouseOveronElement(driver,singoutmouseover);
	
	}
		
	public void singOutLink() 
	{
		singoutbutton.click();
		}
		
	}


