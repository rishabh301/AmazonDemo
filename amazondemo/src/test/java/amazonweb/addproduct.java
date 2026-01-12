package amazonweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class addproduct extends multipagetest {
  
	@Test(priority=10)
	public void addanother() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		Thread.sleep(3000);
//		System.out.println("adding another element");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[6]/div/a")).click();
//		//*[@id="title-B0FTRN7L8Q"]/span/span/span[2]
//		Thread.sleep(3000);
//		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div[2]/div[2]/a/div[2]/div[1]/span/span[2]/span[2]")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//		
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"))));
//		
//		
//		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));
//		if(element3.isDisplayed())
//		{
//			System.out.println("buynow button displayed");
//		}
//		else
//		{
//			System.out.println("buynot btn not displayed");
//		}
//		JavascriptExecutor js3 = (JavascriptExecutor)driver;
//		js3.executeScript("arguments[0].scrollIntoView(true);", element3);
//		Thread.sleep(2000);
//		element3.click();
		
	}
}
