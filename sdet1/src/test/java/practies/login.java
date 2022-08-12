package practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/commandata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String username=p.getProperty("un");
		String password=p.getProperty("pw");
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.findElement(By.name("user_name")).sendKeys(username);
driver.findElement(By.name("user_password")).sendKeys(password);
driver.findElement(By.id("submitButton")).click();
	}

}
