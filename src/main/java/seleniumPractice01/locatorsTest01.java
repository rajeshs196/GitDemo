package seleniumPractice01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locatorsTest01 
{

	public static void main(String[] args) 
	{
		//chromedriver.exe is used to invoke the browser
		
		//Selenium Manager will perform this below task automatically, use it when it doesnt work or when selenium manager is disabled
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\drvrs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahulshetty");
		driver.findElement(By.name("inputPassword")).sendKeys("passpass");
		driver.findElement(By.className("signInBtn")).click();
		
		String errorTxt = driver.findElement(By.cssSelector("p[class='error']")).getText();
		
		Assert.assertEquals(errorTxt, "* Incorrect username or password");
		System.out.println(errorTxt);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("RahulShetty");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("learning");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("789284999");
		//driver.findElement(By.partialLinkText("Reset")).click();
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		String succTxt = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		Assert.assertEquals(succTxt, "Please use temporary password 'rahulshettyacademy' to Login..");
		System.out.println(succTxt);
		
		
		
		
		//driver.findElement(By.className("forgot-pwd-container")).click();
	}

}
