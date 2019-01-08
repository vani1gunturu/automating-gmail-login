package com.abc.gmail;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmail
{
	public static void main(String[] args) throws Exception
	{
		InputStream file = Gmail.class.getClassLoader().getResourceAsStream("com/abc/gmail/objects.properties");
		Properties properties=new Properties();                             
		properties.load(file);
		String usernamelocation = properties.getProperty("usnlocation");
		String next1 = properties.getProperty("next1");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String passwordlocation = properties.getProperty("passwordlocation");
		String next2 = properties.getProperty("next2");
		System.setProperty("webdriver.chrome.driver","/home/vani/selenium components/chromedriver_linux64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id(usernamelocation)).sendKeys(username);
		driver.findElement(By.className(next1)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(passwordlocation)).sendKeys(password);
		driver.findElement(By.xpath(next2)).click();
    }
}


