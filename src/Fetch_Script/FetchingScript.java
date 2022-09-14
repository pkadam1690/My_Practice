package Fetch_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingScript 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chartink.com/");
		
		
		
		
	}
	
	
	
}
