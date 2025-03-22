package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features="C:\\Users\\Dell\\Downloads\\practice_one\\src\\test\\java\\feature\\User.feature",
		    glue= {"stepDef","utility"},
		    plugin= {
		    		"pretty",
		    		"html:target/reports-cucumber/cucmber.html",
		    		"json:target/reports-cucumber/cucumber.json"
		    		
		    },
		
		monochrome = true 
		
	
		)

public class Runner {

}
