package com.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class Driver {
    private static  ThreadLocal<WebDriver>driverPool=new  ThreadLocal<>();
    private static WebDriver driver;
    //1-Make constructor private
    private Driver() {
    }
    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "Opera":
                    operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "chrome-headless":
                    chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {// before used
            driver.quit();
            driver = null;
        }
    }
}
