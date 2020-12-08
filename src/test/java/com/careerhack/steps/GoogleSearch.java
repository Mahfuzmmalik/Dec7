package com.careerhack.steps;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.careerhack.common.GoogleBase;
import com.careerhack.pages.GoogleHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch extends GoogleBase{

	GoogleHomePage ghp;
	
	@Given("^I am on google homepage$")
	public void i_am_on_google_homepage() {
	
		launchBrowser();
	}


	@When("^I enter search \"([^\"]*)\"$")
	public void i_enter_search(String term) {
	//WebElement searchBox = driver.findElement(By.name("q"));
		
		     // searchBox.sendKeys(term);
		      //searchBox.sendKeys(Keys.TAB);
		
		ghp = new GoogleHomePage(driver);
		ghp.enterSearchBox(term);
	}

	@When("^I click on google search button$")
	public void i_click_on_google_search_button() {
	
		//WebElement searchButton = driver.findElement(By.id("gsr"));
	              //searchButton.click();
		ghp.clickGoogleSearch();
		
	}

	@Then("^I recieve relative search contents$")
	 void i_recieve_relative_search_contents() {
	
		String title = driver.getTitle();
		//quality assurance - Google Search
		System.out.println(title);
		
		
		closeBrowser();

	}

}
