package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productValidation {
	
	public productValidation(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="span.lvtHeaderText")
	private WebElement ActvalProductData;
	
	
	
	public WebElement getActvalProductData() {
		return ActvalProductData;
	}



	public String ActvalProductDataName() 
	{
		return ActvalProductData.getText();
	}
}
