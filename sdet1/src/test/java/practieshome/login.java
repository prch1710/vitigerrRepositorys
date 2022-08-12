package practieshome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[]args) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/commandata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url1");
		String un=p.getProperty("user");
	String pw=p.getProperty("pass");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pw);
	driver.findElement(By.xpath("//span[text()='Login'][2]")).click();
	
	}

}
