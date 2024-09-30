package groupss.group;

package com.example.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Runs Chrome in headless mode.

        driver = new ChromeDriver(options);
    }

    @Test
    public void testSuccessfulLogin() {
        driver.get("https://www.germanyiscalling.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("validUsername");
        passwordField.sendKeys("validPassword");
        loginButton.click();

        // Verify successful login, e.g., by checking the presence of a logout button
        WebElement logoutButton = driver.findElement(By.id("logoutButton"));
        assertTrue(logoutButton.isDisplayed());
    }

    @Test
    public void testUnsuccessfulLogin() {
        driver.get("https://www.germanyiscalling.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("invalidUsername");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();

        // Verify unsuccessful login, e.g., by checking the presence of an error message
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        assertTrue(errorMessage.isDisplayed());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

