package FirstCucumber.FirstCucumberProject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import pom.qa.pages.Homepage;
import pom.qa.pages.LoginPortofolio;
import pom.qa.util.Testbase;


public class Datatabledefinition extends Testbase {

	//LoginPortofolio loginportofolio;
	Homepage homepage;
	LoginPortofolio loginportofolio = PageFactory.initElements(driver, LoginPortofolio.class);
	
	@Given("^User open browser$") 
	public void openBrowser(DataTable browser){
		List<List<String>> browserdata=browser.asLists();
		Testbase.initialization(browserdata.get(0).get(0));
		System.out.println("Opening browser " +  browser);
	}
	
	@And("^User open url (.*?)$")
    public void navigate(String loginURL) {
    	 driver.get(prop.getProperty("loginURL"));
      	System.out.println("Navigating to " + loginURL);
    	 	
    }
	
	  @And("^User validate login page content$")
	    public void validatepagetext() {
	    	LoginPortofolio loginportofolio =new LoginPortofolio();
	    	String loginpagetext=loginportofolio.valiateloginpage();
	    	//String loginpagetext=loginportofolio.higuest().getText();
	        Assert.assertEquals("Hi Guest", loginpagetext);
	    	System.out.println("validatepagetext to Hi Guest  " + loginpagetext);
	    	 	
	    }
	  
	  @And("^User entered emailid and password$")
	    public void login(DataTable credentials) throws InterruptedException {
		  List<List<String>> data=credentials.asLists();
	    	LoginPortofolio loginportofolio =new LoginPortofolio();
	     homepage=loginportofolio.login(data.get(0).get(0), data.get(0).get(1));
	    }
	  
	  @Then("User Homepage is displayed")
	    public void homepage_is_displayed() {
	       boolean flag=homepage.verifycorrectusername();
	       Assert.assertTrue(flag); 
	    
	    }

	    @Then("User validate home page title")
	    public void validate_home_page_title() {
	    	 String homepagetitle=homepage.verifyHomepagetitle();
	         Assert.assertEquals("Rediff Moneywiz | My Portfolio(s)",homepagetitle);
	    }
	    
}


