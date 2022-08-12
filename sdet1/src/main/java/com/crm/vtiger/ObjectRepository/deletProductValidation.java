package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deletProductValidation {

	public deletProductValidation(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="span.lvtHeaderText")
	private WebElement actvaldeletproductdata;
	
	
	public WebElement getactvaldeletproductdata() 
	{
		return actvaldeletproductdata;
	}
	
	
	public String actvaldeletproductdataName() 
	{
		return actvaldeletproductdata.getText();
	}
}
