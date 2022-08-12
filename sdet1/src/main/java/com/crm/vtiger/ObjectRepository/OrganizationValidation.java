package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationValidation {
	
	public  OrganizationValidation(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(css="span.dvHeaderText")
	private WebElement actualorganizationData;

	public WebElement getActualProductData() {
		return actualorganizationData;
	}
	
	public String actualorganizationDataName() 
	{
		return actualorganizationData.getText();
	}
}
