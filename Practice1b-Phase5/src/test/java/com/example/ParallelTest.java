package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {
        // Set up WebDriver based on the browser parameter
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    @Test(groups = { "group1" })
    public void testMethod1() {
        driver.get("https://www.example.com");
        System.out.println("Title of the page in " + driver.getTitle());
    }

    @Test(groups = { "group2" })
    public void testMethod2() {
        driver.get("https://www.google.com");
        System.out.println("Title of the page in " + driver.getTitle());
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
