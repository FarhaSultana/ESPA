package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.IndexPage;
import stepDefinition.Ty1;

public class Testbase {
	 protected WebDriver driver;
	public Ty1 ty;
	public IndexPage ip;
	public void setup() {
		System.setProperty("webdriver.edge.driver","C:/Users/DELL/eclipse-workspace/ESPA/EdgeDriver/msedgedriver.exe");
		  driver=new EdgeDriver();
		 
		  ip=new IndexPage(driver);
		 driver.get("https://www.espaskincare.com/");
		
	}
	

}
