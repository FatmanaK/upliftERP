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
    private static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
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
                default:
                    
            }
        }
        return driver;

    }

    public static void closeDriver() {
        if (driver!= null) {
            driver.quit();
            driver = null;
        }
    }
}
