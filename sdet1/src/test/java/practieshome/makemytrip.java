package practieshome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("hubli");
		driver.findElement(By.xpath("//p[text()='Hubli, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("tr");
		driver.findElement(By.xpath("//p[text()='Thiruvananthapuram, India']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		String requiredmonth="november";
		String requiredyear="2022";
		String requireddate="15";
		
		String currentMonthYear=driver.findElement(By.xpath("//div[text()='August 2022']")).getText();
		String currentMonth=currentMonthYear.split(" ")[0];
		String currentYear=	currentMonthYear.split(" ")[1];
		
		while(!(currentMonth.equalsIgnoreCase(requiredmonth)&& currentYear.equals(requiredyear))) 
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			currentMonthYear=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
			currentMonth=currentMonthYear.split(" ")[0];
			currentYear=currentMonthYear.split(" ")[1];
		}
		driver.findElement(By.xpath("(//p[.='"+requireddate+"'])[1]")).click();
		
		
	
		
		
		driver.close();
	}

}
