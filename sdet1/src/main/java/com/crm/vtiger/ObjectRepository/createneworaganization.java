package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createneworaganization {
	
public createneworaganization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="accountname")
	private WebElement oraganizationTextFlied;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement  saveButton;
	
	
public void oraganizationTextFlied(String oraganizationName)
{
	oraganizationTextFlied.sendKeys(oraganizationName);	
}
public  void saveLink() 
{
	 saveButton.click();
}

public WebElement getOraganizationTextFlied() {
	return oraganizationTextFlied;
}
public WebElement getSaveButton() {
	return saveButton;
}
}
