
package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
       (  
    		   
		features="src/test/resources/BUSINESSLOGIC",
		tags="@RegressionTest",
		monochrome=true,
		plugin="pretty",
		glue="cucumbermap"	
		
        )



public class RunTest
{

}
