package com.nexor.pages;

import com.nexor.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs extends Utility {
    private static final Logger log = LogManager.getLogger(AboutUs.class.getName());

    public AboutUs() {
        PageFactory.initElements(driver, this);}
    @CacheLookup
    @FindBy(xpath = "//a[@id='cookie_action_close_header']")
    WebElement accept;


    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]")
    WebElement aboutUs;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[2]/nav[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")
    WebElement ourStory;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'OUR STORY')]")
    WebElement ourStoryTextField;

    public String ourStoryText(){
        log.info("Getting text from : " + ourStoryTextField.toString());
        return getTextFromElement(ourStoryTextField);

    }
    public void clickOnCookies(){
        mouseHoverToElement(accept);
        log.info("Getting text from : " + accept.toString());
    }

    public void clickOnContactUs(){
        mouseHoverToElement(aboutUs);
        log.info("Getting text from : " + aboutUs.toString());
    }
    public void clickOnOurStory(){
        clickOnElement(ourStory);
        log.info("Getting text from : " + ourStory.toString());
    }
}
