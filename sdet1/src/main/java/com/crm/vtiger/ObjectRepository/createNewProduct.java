package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewProduct {
	
	public  createNewProduct(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="productname")
	private WebElement productTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public void product(String productName) 
	{
		productTextField.sendKeys(productName);
	}
	
	public void save()
	{
		
		saveButton.click();
	}

	public WebElement getProductTextField() {
		return productTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	

}
