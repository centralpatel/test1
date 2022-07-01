package com.nexor.steps;

import com.nexor.pages.AboutUs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on the Homepage$")
    public void iAmOnTheHomepage() {
        new AboutUs().clickOnCookies();
    }


    @When("^I mouseHover on contact us link$")
    public void iMouseHoverOnContactUsLink() {
        new AboutUs().clickOnContactUs();

    }

    @And("^I click on our story link$")
    public void iClickOnOurStoryLink() {
        new AboutUs().clickOnOurStory();
    }

    @Then("^I should see 'story link' text$")
    public void iShouldSeeStoryLinkText() {
        String expectedText="OUR STORY";
        String actualText=new AboutUs().ourStoryText();
        Assert.assertEquals(expectedText,actualText);
    }
}
