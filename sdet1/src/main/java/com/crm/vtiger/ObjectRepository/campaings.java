package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaings {
	
	public campaings(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement pulseButton;
	
	
	public void plus()
	{
		pulseButton.click();
	}


	public WebElement getPulseButton() {
		return pulseButton;
	}
	

}
