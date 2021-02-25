package com.Pages;

import com.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class BasePage {
    //PageFactory her seferinde init yazmamak icin bunu base page icine koyup diger page;leri extend ediyoruz.

    BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
       // Logger logger = Logger.getLogger(BasePage.class);
    }
}
