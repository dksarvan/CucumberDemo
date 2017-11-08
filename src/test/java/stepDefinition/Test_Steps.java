package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public static WebDriver driver = null;	

	
	@Given("^User is on Home Page$")
	public void User1_is_on_Home_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resource\\geckodriver.exe");
        driver = new FirefoxDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("http://www.store.demoqa.com");
		//throw new PendingException();
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	    //throw new PendingException();
	}

	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		  // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.

        driver.findElement(By.id("log")).sendKeys("demoqa"); 
        //driver.findElement(By.id("log")).sendKeys(username); 

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver.findElement(By.id("pwd")).sendKeys("aqomeD@123");
        //driver.findElement(By.id("pwd")).sendKeys(password);
        
        // Now submit the form. WebDriver will find the form for us from the element 

        driver.findElement(By.id("login")).click();
	    //throw new PendingException();
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
        // Print a Log In message to the screen

        System.out.println("Login Successfully");

	    //throw new PendingException();
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
       // System.out.println("Login Successfully");

        // Find the element that's ID attribute is 'account_logout' (Log Out)

		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	    //throw new PendingException();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had

        // Print a Log In message to the screen

        System.out.println("LogOut Successfully");
        // Close the driver

        driver.quit();
	    //throw new PendingException();
	}


}
