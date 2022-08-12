package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productSearch {

	public productSearch(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="search_text")
	private WebElement searchTextField;
	
	@FindBy(name="search")
	private WebElement searchButton;
	
	public void searchTextField(String product) 
	{
		searchTextField.sendKeys(product);
		
		
	}
	public void searchButton() {
		searchButton.click();
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
}
