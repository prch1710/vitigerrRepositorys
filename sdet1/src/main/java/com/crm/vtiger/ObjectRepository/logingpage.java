package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logingpage {
	
	//initalization

	public  logingpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		}
	
	//declaration
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement SubmitButton;

	public WebElement getUserNameTextField()
	{
		return userNameTextField;
	}

	
	

	public WebElement getPasswordTextField()
	{
		return passwordTextField;
	}


	

	public WebElement getSubmitButton()
	{
		return SubmitButton;
	}

	
	
	/**
	 * Business logiss
	 * 
	 */
	public void login(String username,String password) 
	{
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		SubmitButton.click();
		
	}
	
	}
