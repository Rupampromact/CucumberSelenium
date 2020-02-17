package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("^Open the Chrome and launch the application$")					
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupam\\Desktop\\automate\\chromedriver_win32\\chromedriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }		

	@When("^Enter the (.*) and (.*)$")  					
    public void enter_the_Username_and_Password(String username, String password) throws Throwable
    {		
       //Thread.sleep(2000);
		 System.out.println(username);
	   driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(username);							
       driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);							
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       Thread.sleep(2000);
    	driver.findElement(By.name("btnReset")).click();					
    }		

}
