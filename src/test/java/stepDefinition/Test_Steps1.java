package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps1 {
	
	WebDriver driver = null;
	
	@Given("^User is on Home Page1$")
	public void User_is_on_Home_Page1() throws Throwable {
		System.out.println("homepage");

	}

	@When("^User Navigate to LogIn Page1$")
	public void User_Navigate_to_LogIn_Page1() throws Throwable {
		System.out.println("login page");

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	//@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_UserName_and_Password1(String username, String password) throws Throwable {
		System.out.println(username+password);

	}

	@Then("^Message displayed Login Successfully1$")
	public void Message_displayed_Login_fully1() throws Throwable {
		System.out.println("login success message");

	}

	@When("^User LogOut from the Application1$")
	public void User_LogOut_from_the_Application1() throws Throwable {
		System.out.println("click logout");

	}

	@Then("^Message displayed LogOut Successfully1$")
	public void Message_displayed_LogOut_Successfully1() throws Throwable {
		System.out.println("Logout");
	}
	
/*	@Given("^User is on Home Page(\\d+)$")
	public void User_is_on_Home_Page(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("User is on Home Page///");
	    //throw new PendingException();
	}

	@When("^User Navigate to LogIn Page(\\d+)$")
	public void User_Navigate_to_LogIn_Page(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("User Navigate to LogIn Page///");
	    //throw new PendingException();
	}

	@When("^User enters UserName and Password(\\d+)$")
	public void User_enters_UserName_and_Password(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("User enters UserName and Password///");
	    //throw new PendingException();
	}

	@Then("^Message displayed Login Successfully(\\d+)$")
	public void Message_displayed_Login_Successfully(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Message displayed Login Successfully///");
	    //throw new PendingException();
	}*/
	
}
