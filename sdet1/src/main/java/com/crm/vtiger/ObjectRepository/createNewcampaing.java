package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericLib.WebdriverUtility;

public class createNewcampaing {

	public   createNewcampaing(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="campaignname")
	private WebElement campaingTextField;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement pulseButtonprodut;
	
	

		
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public void campaing(String campaing) 
	{
		campaingTextField.sendKeys(campaing);
		
	}
	public void  pulseButtonprodut() 
	{
		//WebdriverUtility wlib=new WebdriverUtility();
		//wlib.switchToWindow(driver,"Products&actions");
		 pulseButtonprodut.click();
	}
	public void saveButton()
	{
		saveButton.click();
	}

	public WebElement getCampaingTextField() {
		return campaingTextField;
	}
	
	public WebElement getpulseButtonprodut() {
		return pulseButtonprodut;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
