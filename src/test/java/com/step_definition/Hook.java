package com.step_definition;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES); //kapatirken screenshot alacak
            scenario.attach(screenShot,"image/png", scenario.getName());

        }
        Driver.closeDriver();
    }
}
