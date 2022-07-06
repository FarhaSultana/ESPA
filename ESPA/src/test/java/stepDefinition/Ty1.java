package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testbase.Testbase;

public class Ty1 extends Testbase{
	
     

	@Given("^Open browser with given url$")
	    public void open_browser_with_given_url() throws Throwable {
		
		 setup();
	        
	    }

	    @When("^i click on ESPA home$")
	    public void i_click_on_espa_home() throws Throwable {
	    	ip.getBody1().click();
	        
	    }

}
