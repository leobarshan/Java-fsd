package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage with file upload functionality
        driver.get("http://www.facebook.com/upload");

        // 1.7.1 Handle File Upload by SendKeys
        // Locate the file input element
        driver.findElement(By.id("fileInput")).sendKeys("F:\\Mphasis\\Phase05\\SeleniumTestApp\\Screenshotsscreenshot.png");

        // Close the browser
        driver.quit();
    }
}
