package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingExternalElements {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("http://www.google.com");

        // 1.5.1 Handling External pop-ups
        // Example: Handling an alert pop-up
        try {
            driver.switchTo().alert().accept(); // Accept the alert
        } catch (Exception e) {
            System.out.println("No alert found.");
        }

        // 1.5.2 Handling new Tabs and new Windows
        // Example: Clicking a link that opens in a new tab
        WebElement link = driver.findElement(By.linkText("Open Link in New Tab"));
        String oldTab = driver.getWindowHandle(); // Store the old tab
        link.click();
        // Switch to the new tab
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(oldTab)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        // Perform actions on the new tab
        // For example:
        System.out.println("Title of the new tab: " + driver.getTitle());

        // Close the new tab and switch back to the old one
        driver.close();
        driver.switchTo().window(oldTab);

        // Close the browser
        driver.quit();
    }
}
