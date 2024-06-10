package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google's homepage
        driver.get("http://www.google.com");

        // Using ID as a Locator
        WebElement elementById = driver.findElement(By.id("hplogo"));

        // Using class name as a Locator
        WebElement elementByClassName = driver.findElement(By.className("gLFyf"));

        // Using name as a Locator (Google homepage doesn't have a name attribute, so this will not work)
        // WebElement elementByName = driver.findElement(By.name("replace_with_name"));

        // Using Link Text as a Locator
        WebElement elementByLinkText = driver.findElement(By.linkText("Images"));

        // Using Xpath as a Locator
        WebElement elementByXpath = driver.findElement(By.xpath("//input[@name='q']"));

        // Using CSS Selector as a Locator
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("input[name='q']"));

        // Using XPath handling complex and dynamic elements (Google homepage doesn't have a complex dynamic element, so this is just an example)
        String complexXpath = "//div[@id='searchform']//input[@name='q']";
        WebElement elementByComplexXpath = driver.findElement(By.xpath(complexXpath));

        // Close the browser
        driver.quit();
    }
}
