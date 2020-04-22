package demo1.Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fsssdd 
{
	@Test
	public void Script1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
	driver.manage().window().maximize();
	driver.close();
	System.out.println("---kanhu---------");
	}

}
