package qSP1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateShifting
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
     driver.get("https://www.cleartrip.com/");
     
     
     
     JavascriptExecutor js =(JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,1500)");
     
     driver.findElement(By.xpath("//*[local-name()='svg' and @class='t-all ml-2']")).click();
     Thread.sleep(2000);
     WebElement next=driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[local-name()='svg' and @data-testid='rightArrow']"));
    
     next.click();
     Thread.sleep(2000);
     next.click();
     
     
  
	}

}

