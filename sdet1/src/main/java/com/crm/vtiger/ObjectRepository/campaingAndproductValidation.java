package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaingAndproductValidation {
	
	public campaingAndproductValidation(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement actvualcampandprodctdata;
	
	
	
	
	public WebElement getActvualcampandprodctdata() {
		return actvualcampandprodctdata;
	}




	public String actvualcampandprodctdataName() 
	{
		return actvualcampandprodctdata.getText();
	}

}
