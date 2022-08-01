package dev.selenium.hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.util.ArrayList;

public class TestLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

        //login(driver, "tomsmith", "SuperSecretPassword!");
        //getMessage(driver);
        //logout(driver);
        driver.close();
        ArrayList<String> login = new ArrayList<String>();
        for (int i = 0 ;i <= 1; i++)
        {
            login(driver,"danh","danh123");
            logout(driver);
        }
    }

    public static void login(WebDriver driver, String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login']/button"));
        loginButton.click();
    }

    public static void logout(WebDriver driver) {
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id='content']/div/a"));
        logoutButton.click();
    }

    public static String getMessage(WebDriver driver) {
        WebElement successMsg = driver.findElement(By.xpath("//*[@id='flash']"));
        String msg = successMsg.getText();
        System.out.println(msg);
        return msg;
    }

}
