package amazonweb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class multipagetest extends homeweb {
	
	// constructor with super keyword
	@Test(priority=1)
	public void samsung() {
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("samsung phones");
		searchbox.submit();
		
		driver.findElement(By.id("nav-search-submit-button"));
	}
	
	@Test(priority=2)
	public void scrolltoelement() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[1]/div/div[2]"));
		if(element.isDisplayed())
		{
			System.out.println("yes element displayred");
		}
		else
		{
			System.out.println("element not displayed");
		}
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	@Test(priority=3)
	public void selectelement() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("a-autoid-3-announce")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("a-autoid-4-announce")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div[1]/span[2]")).click();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//a[@id='nav-cart']"));
		if(ele2.isDisplayed())
		{
			System.out.println("add to cart icon is displayed");
		}
		else
		{
			System.out.println("add to cart not displayed");
		}
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		
		
		Thread.sleep(2000);
	//	System.out.println("not clicked on addtocart");
		
	}
	
	@Test(priority=4)
	public void checkout() throws InterruptedException
	{
		
//		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.id("ap_email_login")).sendKeys("rishabhsha301@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input")).click();
		
		
	}
  
}
