package com.crm.sdet1.product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

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
import com.crm.vtiger.ObjectRepository.createNewProduct;
import com.crm.vtiger.ObjectRepository.logingpage;
import com.crm.vtiger.ObjectRepository.productPage;
import com.crm.vtiger.ObjectRepository.productValidation;
@Listeners(com.crm.vtiger.GenericLib.ListenerImplementation.class)
public class createproductTest extends BaseClass{
	
	
@Test(groups="regrationTest")
	public  void products() throws Throwable {
		

		
		
	
		
		Homepage homepage=new Homepage(driver);
		homepage.productLink();
		
		
		productPage pro=new productPage(driver);
		pro.pulse();
		
		
		
	javaUtility jlib=new javaUtility ();
	int ranNum=	jlib.getRandNum();


	excelUtility excel=new excelUtility();
	String productName=excel.getDataFromexcel("product", 1, 0)+ranNum;
	System.out.println(productName);
	
	createNewProduct products=new createNewProduct(driver);
	products. product(productName);
	products.save();
	
	
	/*String actdata=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
	if(actdata.contains(productName))
	{
		System.out.println("pass");
	}else {
		System.out.println("fail");
		
	}*/
	productValidation productvali=new productValidation(driver);
	String actvaldata=productvali.ActvalProductDataName();
	Assert.assertEquals(actvaldata.contains(productName),true);
	
	

	homepage.singoutmouseover(driver);
	
	homepage.singOutLink();
	driver.close();
	
}
}


	
	
	
	


