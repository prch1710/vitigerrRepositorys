package com.crm.sdet1.organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import com.crm.vtiger.ObjectRepository.OrganizationValidation;
import com.crm.vtiger.ObjectRepository.campaingAndproductValidation;
import com.crm.vtiger.ObjectRepository.createneworaganization;
import com.crm.vtiger.ObjectRepository.logingpage;
import com.crm.vtiger.ObjectRepository.oragnizationpage;
@Listeners(com.crm.vtiger.GenericLib.ListenerImplementation.class)
public class createorganizationTest extends BaseClass {
	
	
	
	@Test(groups="regrationTest")
	public  void  oraganization() throws Throwable {
	

		WebdriverUtility wlib=new WebdriverUtility();
		
		
	
	
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wlib.waitForPageToLoad(driver);
	
	
		
		
		 Homepage homep=new  Homepage (driver);
		 homep.oraganizationlink();
		
		 oragnizationpage oragpage=new oragnizationpage (driver);
		 oragpage.pulsbutton();
		 
		// Assert.assertEquals(false, true);//intentionally failing the script
		 
		javaUtility jlib=new javaUtility ();
		int ranNum=	jlib.getRandNum();
	
		
		excelUtility excel=new excelUtility();
		String organize =excel.getDataFromexcel("organization",1, 0)+ranNum;
		System.out.println(organize);
		
		createneworaganization orag=new createneworaganization(driver);
		orag.oraganizationTextFlied(organize);
		orag.saveLink();
		
		

		
		
		
	/*String text=driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
		System.out.println(text);
		
		if(text.contains(organize))
		{
		System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}*/
		
		OrganizationValidation organization=new OrganizationValidation( driver);
		String actualdata =organization.actualorganizationDataName();
		Assert.assertEquals(actualdata.contains(organize),true);
		
		

		homep.singoutmouseover(driver);
		
		homep.singOutLink();
		
		
		driver.close();
		
		
		
		
		
		

	}
	

}
