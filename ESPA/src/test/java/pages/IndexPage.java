package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class IndexPage extends Testbase {
	WebDriver driver;
	public IndexPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(linkText="Body")
	private WebElement Body1;
	 public WebElement getBody1(){
		 return Body1;
		
	}
	 }


