package pom.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.qa.util.Testbase;

public class LoginPortofolio extends Testbase {

	
	@FindBy(name="email-id")
	WebElement emailid;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(id="emailsubmit")
	WebElement loginbutton;
	
	@FindBy(id="loginsubmit")
	WebElement loginsubmit;
	
	@FindBy(xpath="//*[@id='signin_info']/a")
	WebElement signup;
	
	@FindBy(xpath="//img[contains(@class,'block msprite moneywizlogo negative curhand')]")
	WebElement redifflogo;
	
	@FindBy(xpath="//*[contains(text(),'Hi Guest')]")
	WebElement higuest;
	
	public LoginPortofolio() {
			PageFactory.initElements(driver, this);
		
	}
	
	public String validatepagetitle() {
		return driver.getTitle();
		
		
	}
	
	
	public String valiateloginpage()
	{
		String text=higuest.getText();
		System.out.println("guesttext value is " + text);
		return text;
		
		
	}  
	/*
	public WebElement higuest() {
	    return higuest;
	}
	*/
	public boolean valiaterediffImage(){
		
		return redifflogo.isDisplayed();
	}
	
	
	public  Homepage login(String eid,String pwd) throws InterruptedException{
		
		emailid.sendKeys(eid);
		loginbutton.click();
		Thread.sleep(2000);
		password.sendKeys(pwd);
		loginsubmit.click();
		
		return new Homepage();
		
	}
	
}