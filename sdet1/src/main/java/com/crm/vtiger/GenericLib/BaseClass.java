package com.crm.vtiger.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.vtiger.ObjectRepository.logingpage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sDriver;
	 propertyUtility plib=new propertyUtility();
	
	@BeforeSuite(groups= {"smokeTest","regrationTest"})
	public void BS() 
	{
		System.out.println("Database connection");
	}
	@BeforeTest(groups= {"smoketesting","regrationtesting"})
	public void BT()
	{
		System.out.println("Excute script in parllal mode");
	}
	
	//@Parameters("BROWSER")//only for crossbrowser
	@BeforeClass(groups= {"smokeTest","regrationTest"})
	public void BC() throws Throwable//String BROWSER) throws Throwable//have to give string BROWSER IN () FOR crossbrowser
	{
		String Browser = plib.getPropertyKeyValue("browser");//have comment this line for crossbrowser
		  if(Browser.equalsIgnoreCase("chrome"))//have to change from browser to BROWSER for crossbrowser
		  {
		   
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  }
		  else if(Browser.equalsIgnoreCase("firefox"))
		  {
		   WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		  }
		  else if(Browser.equalsIgnoreCase("edge"))
		   {
		   WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		   }
		   else
		   {
		     driver = new ChromeDriver();
		   }
		  sDriver=driver;
		  
		//System.out.println("Lanching the browser");
	}
	@BeforeMethod(groups= {"smokeTest","regrationTest"})
	public void BM() throws Throwable
	{
		System.out.println("Login to Application");
		
		String url=plib.getPropertyKeyValue("url");
		String username=plib.getPropertyKeyValue("un");
		String password=plib.getPropertyKeyValue("pw");
		driver.get(url);
		logingpage login=new logingpage(driver);
		login.login(username, password);
		}
	@AfterMethod(groups= {"smoketesting","regrationtesting"})
	public void AM() 
	{
		System.out.println("logout from application");
	}
	@AfterClass(groups= {"smokeTest","regrationTest"})
	public void AC()
	{
		System.out.println("");
	}
	@AfterTest(groups= {"smokeTest","regrationTest"})
	public void AT() 
	{
		System.out.println("");
	}
	@AfterSuite(groups= {"smokeTest","regrationTest"})
	public void AS()
	{
		System.out.println("");
	}
}
