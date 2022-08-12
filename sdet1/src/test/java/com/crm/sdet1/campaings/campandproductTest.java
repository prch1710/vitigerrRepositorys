package com.crm.sdet1.campaings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
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
import com.crm.vtiger.ObjectRepository.campaingAndproductValidation;
import com.crm.vtiger.ObjectRepository.campaings;
import com.crm.vtiger.ObjectRepository.createNewProduct;
import com.crm.vtiger.ObjectRepository.createNewcampaing;
import com.crm.vtiger.ObjectRepository.logingpage;
import com.crm.vtiger.ObjectRepository.productPage;
import com.crm.vtiger.ObjectRepository.productSearch;
import com.google.common.collect.Iterators;
@Listeners(com.crm.vtiger.GenericLib.ListenerImplementation.class)

public class campandproductTest extends BaseClass {
@Test(groups= "smokeTest")
	public  void campaingAndProduct() throws IOException, Throwable {
		
		
		
		WebdriverUtility wlib=new WebdriverUtility();
		excelUtility excel=new excelUtility();
		javaUtility jlib=new javaUtility ();
		int ranNum=	jlib.getRandNum();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		

		Homepage homepage=new Homepage(driver);
		homepage.productLink();
		
		
		productPage pro=new productPage(driver);
		pro.pulse();
		
		String productName=excel.getDataFromexcel("product", 1, 0)+ranNum;

		createNewProduct products=new createNewProduct(driver);
		products. product(productName);
		products.save();
	

	
	System.out.println(productName);
	homepage.moreLink(driver);
	
	homepage.campaingn();
	 
	 campaings camp=new  campaings(driver);
	 camp.plus();
	
	
		
	
	
		String campaignName=excel.getDataFromexcel("camp", 1, 0)+ranNum;
		
		
		System.out.println(campaignName);
		
		createNewcampaing createcamp=new createNewcampaing(driver);
		
		createcamp.pulseButtonprodut();

		
	
		wlib.switchToWindow(driver,"Products&actions");
		productSearch prosearch=new productSearch (driver);
		prosearch.searchTextField(productName);
		prosearch.searchButton();

		
		
		driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
		
		wlib.switchToWindow(driver,"Campaigns&Action");
		
		
		
		
		createcamp.campaing(campaignName);
		createcamp.saveButton();
		
	/*	String actData=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(actData.contains(campaignName)) 
		{
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}*/

		campaingAndproductValidation cAndp=new campaingAndproductValidation ( driver);
		String actualdata =cAndp.actvualcampandprodctdataName();
		Assert.assertEquals(actualdata.contains(campaignName),true);
		
		homepage.singoutmouseover(driver);
		
		homepage.singOutLink();
	
		
		
		driver.close();
		
		
	}

}
