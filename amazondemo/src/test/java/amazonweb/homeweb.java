package amazonweb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class homeweb {
	static WebDriver driver;
	@BeforeSuite
	public void initialize() {
		//driver ka window maximize karo
		//timeout lagao
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@BeforeClass
	public void intialclass()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@BeforeMethod
	public void intializeTest() {
		
	}
	
	@AfterMethod
	public void tearDownSuite() {
		
	}
	
	@AfterSuite
	public void tearDownTestMethodI() throws InterruptedException{
		System.out.println("driver quit");
		Thread.sleep(2000);
	//	driver.quit();
	}
}
