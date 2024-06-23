package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_1 {

	WebDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setup() throws InterruptedException   {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);	
}
   @Test  ( priority = 1)
   public void user_registration() throws InterruptedException {
	   driver.findElement(By.xpath("//button[@class='Button-sc-1dr2sn8-0 Header___StyledButton2-sc-19kl9m3-10 yUcSa iHDHpz']")).click();;
		Thread.sleep(2000);
		driver.findElement(By.id("multiform")).sendKeys("8976282329");
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='headlessui-portal-root']//input[1]")).sendKeys("111111");        
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='absolute top-0 right-0']//button[@type='button']//*[name()='svg'] ")).click(); 
		Thread.sleep(2000);	
		 
}
 
   @Test  ( priority = 2)
   public void product_search() throws InterruptedException {
	   
	driver.findElement(By.xpath("//input[@placeholder='Search for Products...']")).sendKeys("potato");
	Thread.sleep(2000);
		
   }	
	
   @Test  ( priority = 3)
   public void Add_To_Cart() throws InterruptedException {
	   
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement scrollUpto = driver.findElement(By.xpath("//button[@pattern='outline']"));

   }
   
}

