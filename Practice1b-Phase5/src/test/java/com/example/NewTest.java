package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
    @Test
    public void test() {
        // Set up Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com");

        // Perform some actions
        // Example: Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
