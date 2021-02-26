package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    //locatorlari bulup yazmaliyiz,findElements ler burda kullan
//url websitesinden inspect yapip locatorlari bul
    @FindBy(xpath ="(//input[@id='login'] )")
    public WebElement email;

    @FindBy(xpath = "(//*[@id='password'])")
    public WebElement passWord;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement LoginButton;

    @FindBy(xpath = " (//span[contains(text(),'EventsCRMManager40')])")
    public WebElement users;

    @FindBy (xpath ="(//div[contains(text(),'Congratulations, your inbox is empty')])")
    ////div[contains(text(),'Congratulations, your inbox is empty')]
    public WebElement Text;

       public void login (String username, String password){

           email.sendKeys(username);

           passWord.sendKeys(password);

           LoginButton.click();





       }

}
