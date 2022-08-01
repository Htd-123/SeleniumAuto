package dev.selenium.hello;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\seleniumdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.get("https://www.google.com/?hl=vi");
        String title = driver.getTitle();
        System.out.println(title);
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));
        driver.get("https://google.com");

        //String title = driver.getTitle();
        //Assertions.assertEquals("Google", title);

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //WebElement searchBox = driver.findElement(By.name("q"));
        //WebElement searchButton = driver.findElement(By.name("btnK"));

        //searchBox.sendKeys("Selenium");
        //searchButton.click();

        //searchBox = driver.findElement(By.name("q"));
        //String value = searchBox.getAttribute("value");
        //driver.quit();
    }
}
