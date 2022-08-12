package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class oragnizationpage {
	//initalizatio
	
	public  oragnizationpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//declarization
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement pulsButton;



public WebElement getPulsButton() {
	return pulsButton;
}



/**
 * Business logic
 * 
 */
public void pulsbutton() 
{
pulsButton.click();	
}


}
