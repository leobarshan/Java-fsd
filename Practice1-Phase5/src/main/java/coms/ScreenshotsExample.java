package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenshotsExample {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("http://www.facebook.com");

        // 1.6.1 Taking screenshots
        takeScreenshot(driver, "screenshot.png");

        // Close the browser
        driver.quit();
    }

    // Method to take a screenshot
    public static void takeScreenshot(WebDriver driver, String filename) {
        // Convert WebDriver object to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture the screenshot as a file
        File screenshotFile = ts.getScreenshotAs(OutputType.FILE);

        // Specify the location where you want to save the screenshot
        String filePath = "F:\\Mphasis\\Phase05\\SeleniumTestApp\\Screenshots" + filename;

        // Move the screenshot file to the desired location
        try {
            Path destinationPath = Paths.get(filePath);
            Files.move(screenshotFile.toPath(), destinationPath);
            System.out.println("Screenshot saved to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
