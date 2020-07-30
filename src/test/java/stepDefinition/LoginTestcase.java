package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.qa.pages.Homepage;
import pom.qa.pages.LoginPortofolio;
import pom.qa.util.Testbase;


public class LoginTestcase extends Testbase {

	//LoginPortofolio loginportofolio;
	Homepage homepage;
	LoginPortofolio loginportofolio = PageFactory.initElements(driver, LoginPortofolio.class);
	
	@Given("^I open (.*)$") 
	public void openBrowser(String browserName){
		Testbase.initialization(browserName);
		System.out.println("Opening browser " +  browserName);
	}
		
    @And("^I navigate to (.*)$")
    public void navigate(String loginURL) {
    	 driver.get(prop.getProperty("loginURL"));
      	System.out.println("Navigating to " + loginURL);
    	 	
    }
    
    @And("^validate login pagetext$")
    public void validatepagetext() {
    	LoginPortofolio loginportofolio =new LoginPortofolio();
    	String loginpagetext=loginportofolio.valiateloginpage();
    	//String loginpagetext=loginportofolio.higuest().getText();
        Assert.assertEquals("Hi Guest", loginpagetext);
    	System.out.println("validatepagetext to Hi Guest  " + loginpagetext);
    	 	
    }
    
    @And("^validate login pagetitle$")
    public void validatepagetitle() {
    	//LoginPortofolio loginportofolio =new LoginPortofolio();
    	String loginpagetitle=loginportofolio.validatepagetitle();
    	Assert.assertEquals("Indian stock markets: Login to Portfolio", loginpagetitle);
    	System.out.println("validatepagetitle to Indian stock markets: Login to Portfolio " + loginpagetitle); 	
    }
    
    @Then("^I entered emailid and password$")
    public void login() throws InterruptedException {
    	LoginPortofolio loginportofolio =new LoginPortofolio();
     homepage=loginportofolio.login(prop.getProperty("username"), prop.getProperty("password"));
    }

   
    @Then("Homepage is displayed")
    public void homepage_is_displayed() {
       boolean flag=homepage.verifycorrectusername();
       Assert.assertTrue(flag);
       
    
    }

    @Then("validate home page title")
    public void validate_home_page_title() {
    	 String homepagetitle=homepage.verifyHomepagetitle();
         Assert.assertEquals("Rediff Moneywiz | My Portfolio(s)",homepagetitle);
    }
    
    @Then("click on myportofolio dropdown and verify")
    public void myportofolio_dropdown() throws InterruptedException {
    	 
    	homepage.selectportofoliodropdown();
      	//String dropdowntext=homepage.verifyHomepagetitle();
         Assert.assertEquals("My Portfolio(s):",homepage.getDropdowntext());
    }
    
}