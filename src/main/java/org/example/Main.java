package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        /*
        SOLUTION # 1
         */


//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        ChromeDriver driver = new ChromeDriver(options);


        /*
        SOLUTION # 2
         */

        System.setProperty("webdriver.http.factory", "jdk-http-client");

        /*
        ====================================================================
         */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        textBox.sendKeys("Selenium");
        submitButton.click();
        driver.quit();
    }
}