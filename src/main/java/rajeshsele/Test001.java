package rajeshsele;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;

public class Test001 
{

	public static void main(String[] args) 
	{
		//chromedriver.exe is used to invoke the browser
		//Selenium Manager will perform this below task automatically, use it when it doesnt work or when selenium manager is disabled
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\drvrs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\rajes\\drvrs\\geckodriver.exe");//this doesnt work, Selenium Manager works
		//WebDriver driver = new FirefoxDriver();
		
		//edge
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\rajes\\drvrs\\msedgedriver.exe");	
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.apache.org/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		//driver.quit();
	}

}
