package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features ="Feature", //locate where feature file is
		glue ={"stepDefinition"}, //locate where stepdefinition file is
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//generate different type of reporting,generate output in pretty format 
		monochrome=true,//display the console output in readable format,
		strict=true,//it will check if any step definition is not defined in step definition file
		dryRun=false //to check the mapping is proper betn Feature and step definition file 
		
		
)


public class TestRunner {
	
}
