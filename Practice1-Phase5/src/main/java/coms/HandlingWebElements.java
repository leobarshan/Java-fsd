package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElements {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "F:\\Mphasis\\Phase05\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the HTML file
        driver.get("file:///F:/Mphasis/Login%20HTMLs/example.html");

        // 1.4.1 Edit box
        WebElement editBox = driver.findElement(By.id("edit_box_id"));
        editBox.sendKeys("Text to enter into the edit box");

        // 1.4.2 Link
        WebElement link = driver.findElement(By.id("link_id"));
        link.click();

        // 1.4.3 Button
        WebElement button = driver.findElement(By.id("button_id"));
        button.click();

        // 1.4.4 Image
        WebElement image = driver.findElement(By.id("image_id"));
        image.click();

        // 1.4.5 Text area
        WebElement textArea = driver.findElement(By.id("textarea_id"));
        textArea.sendKeys("Text to enter into the text area");

        // 1.4.6 Checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox_id"));
        checkbox.click();

        // 1.4.7 Radio button
        WebElement radioButton = driver.findElement(By.id("radio_button_id"));
        radioButton.click();

        // 1.4.8 Dropdown list
        Select dropdown = new Select(driver.findElement(By.id("dropdown_id")));
        dropdown.selectByVisibleText("Option 1");

        // 1.4.9 Web table / HTML table
        WebElement tableElement = driver.findElement(By.id("table_id"));
        // Handle the table as needed

        // 1.4.10 Frame
        WebElement frame = driver.findElement(By.id("frame_id"));
        driver.switchTo().frame(frame);
        // Interact with elements inside the frame
        // For example, find elements within the frame
        WebElement frameContent = driver.findElement(By.tagName("h1"));
        System.out.println("Frame content: " + frameContent.getText());
        driver.switchTo().defaultContent(); // Switch back to the default content

        // 1.4.11 Switching between tabs in the same browser window
        // Open a new tab (this will depend on your webpage structure)
        // Switch to the new tab
        driver.switchTo().window("window_handle_of_the_new_tab");

        // Close the browser
        driver.quit();
    }
}
