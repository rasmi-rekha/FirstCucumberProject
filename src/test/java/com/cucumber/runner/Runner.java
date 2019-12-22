package com.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;




@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		strict=false,
		monochrome=false,
		features= {"D:/workspace/FirstCucumberProject/src/test/resource/com/cucumber/rediff/Login.feature"},
		//features= {"src/test/resource/"},
		glue = {"FirstCucumber.FirstCucumberProject"},
		plugin= {
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"}
		
		)

public class Runner {

}
