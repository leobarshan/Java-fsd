package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEx1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("facebook");
			element.submit();
			
		if(element!=null) {
			System.out.println("Text box found");
			}
		
		else
			System.out.println("Text box not found");
		

	}
}
