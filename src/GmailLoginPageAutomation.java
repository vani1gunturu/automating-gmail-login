import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginPageAutomation {

	public static void main(String[] args) throws Exception {
		
		//setting the path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "/home/vani/selenium components/chromedriver_linux64/chromedriver");
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the chrome
		driver.manage().window().maximize();
		//applying implicit wait to load the elements in the web page
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//enter the url
		driver.get("https://www.gmail.com");
		//enter the email into email field
		driver.findElement(By.id("identifierId")).sendKeys("XXXXXXXXXXX@gmail.com");
		//click on Next button
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		//enter the password into password field
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("XXXXXX");
		//click on Next button
		driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
		
		
 }
		

	}


