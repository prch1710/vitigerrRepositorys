package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericLib.WebdriverUtility;

public class productDelet {
	public productDelet(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@title='Delete [Alt+D]']")
	private WebElement delectButton;
	
	

	public void delet() {
	
		delectButton.click();
	}


	public WebElement getDelectButton() {
		return delectButton;
	}
	

}
