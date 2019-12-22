package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.qa.util.Testbase;

public class Homepage extends Testbase

{
	@FindBy(xpath="//*[@id='username']/a")
	WebElement loginusername;
	
	@FindBy(xpath="//a[contains(text(),'Stocks')]")
	WebElement stocks;
	
	@FindBy(xpath="//*[@id='moremoney']/ul/li[2]/a")
	WebElement forexlink;
	
	@FindBy(xpath="//*[@id='portfolioid']")
	WebElement portofoliodropdown;
	
	public Homepage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomepagetitle(){
		
		return driver.getTitle();
		
		
	}
	
	public boolean verifycorrectusername(){
		
		return loginusername.isDisplayed();
		
		
	}
	
	
	public void clickonmyportofoliodropdown(){
		
		portofoliodropdown.click();
				
		
	}

}
