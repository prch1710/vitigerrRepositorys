package com.crm.sdet1.campaings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericLib.BaseClass;
import com.crm.vtiger.GenericLib.WebdriverUtility;
import com.crm.vtiger.GenericLib.excelUtility;
import com.crm.vtiger.GenericLib.javaUtility;
import com.crm.vtiger.GenericLib.propertyUtility;
import com.crm.vtiger.ObjectRepository.Homepage;
import com.crm.vtiger.ObjectRepository.campaings;
import com.crm.vtiger.ObjectRepository.campaingsValidation;
import com.crm.vtiger.ObjectRepository.createNewcampaing;
import com.crm.vtiger.ObjectRepository.logingpage;
@Listeners(com.crm.vtiger.GenericLib.ListenerImplementation.class)

public class createcampaingsTest extends BaseClass{
@Test(groups="smokeTest")
	public void campaings() throws Throwable {
		
		Homepage homepage=new  Homepage (driver);
		
		 homepage.moreLink(driver);
		 homepage.campaingn();
		 WebdriverUtility wlib=new WebdriverUtility();
		 wlib.waitForPageToLoad(driver);
		 campaings camp=new  campaings(driver);
		 camp.plus();
		 
		javaUtility jlib=new javaUtility ();
		int ranNum=	jlib.getRandNum();
		
		excelUtility excel=new excelUtility();
		String organize =excel.getDataFromexcel("camp",1, 0)+ranNum;
		System.out.println(organize);
		
		createNewcampaing createcamp=new createNewcampaing(driver);
		createcamp.campaing(organize);
		createcamp.saveButton();
		
		System.out.println(organize);
		
		/*String text=driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
		System.out.println(text);
	
		if(text.contains(organize))
			{
				System.out.println("valid");
			}else
			{
				System.out.println("invalid");
			}*/
		campaingsValidation campvalidation=new campaingsValidation(driver);
		String  actualdata =campvalidation.actualOrganizationDataName();
		Assert.assertEquals(actualdata.contains(organize),true);
		
	
		homepage.singoutmouseover(driver);
		homepage.singOutLink();
		driver.close();
	
	
	}

}



	


