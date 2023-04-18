package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\13066\\git\\FacebookBDD\\FacebookBDDProject\\src\\main\\java\\features\\login.feature", //the path of the feature file
				glue={"stepDefinitions"},//the pathe of the stepdefinitions file
				plugin = {"pretty","html:target/cucumber-reports/report.html",
						           "junit:target/cucumber-reports/cucumber.xml",
						           "json:target/cucumber-reports/report2.json"},//provide information to user 
				monochrome = true,//display the console output in a proper readable format
				dryRun = false // to check the mapping is proper between feature file and step def file
		        	
		)

public class TestRunner {

}
