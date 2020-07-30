package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import pom.qa.pages.Homepage;
import pom.qa.pages.LoginPortofolio;
import pom.qa.util.Testbase;


public class Datadrivendefinition extends Testbase {

	//LoginPortofolio loginportofolio;
	Homepage homepage;
	LoginPortofolio loginportofolio = PageFactory.initElements(driver, LoginPortofolio.class);
	
	@Given("^User will open \"(.*)\" browser$") 
	public void openBrowser(String browser){
		//List<List<String>> browserdata=browser.asLists();
		Testbase.initialization(browser);
		System.out.println("Opening browser " +  browser);
	}
	
	@And("^User open (.*?)$")
    public void navigate(String loginURL) {
    	 driver.get(prop.getProperty("loginURL"));
      	System.out.println("Navigating to " + loginURL);
    	 	
    }
	
	  @And("^User validated login page content$")
	    public void validatepagetext() {
	    	LoginPortofolio loginportofolio =new LoginPortofolio();
	    	String loginpagetext=loginportofolio.valiateloginpage();
	    	//String loginpagetext=loginportofolio.higuest().getText();
	        Assert.assertEquals("Hi Guest", loginpagetext);
	    	System.out.println("validatepagetext to Hi Guest  " + loginpagetext);
	    	 	
	    }
	  
	  @And("^User entered \"(.*)\" and \"(.*)\"$")
	    public void login(String username,String password) throws InterruptedException {
		  //List<List<String>> data=credentials.asLists();
			LoginPortofolio loginportofolio =new LoginPortofolio();
		     homepage=loginportofolio.login(username,password);
	    }
	  
	  @Then("User name is displayed on Homepage")
	    public void homepage_is_displayed() {
	       boolean flag=homepage.verifycorrectusername();
	       Assert.assertTrue(flag); 
	    
	    }

	    @Then("User validated home page title")
	    public void validate_home_page_title() {
	    	 String homepagetitle=homepage.verifyHomepagetitle();
	         Assert.assertEquals("Rediff Moneywiz | My Portfolio(s)",homepagetitle);
	    }
	    
}


