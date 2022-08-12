package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaingsValidation {
	
	public campaingsValidation(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="span.dvHeaderText")
	private WebElement actualOrganizationData;
	
	
	
	
	
	public WebElement getActualOrganizationData() {
		return actualOrganizationData;
	}





	public String actualOrganizationDataName() 
	{
		return actualOrganizationData.getText();
	}

}
