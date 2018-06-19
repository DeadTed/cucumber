package Features;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Date;
import java.util.List;

public class MyStepdefs {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
System.out.println("I navigate to the login page");
    }

    @And("^I enter the username as \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPassword(String username, String password) throws Throwable {
        System.out.println("I enter the username and password");
        System.out.println("Username is : " + username);
        System.out.println("Password is : " + password);
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> date = table.raw();
        System.out.println("I enter the following for Login");
        System.out.println(" ");
        System.out.println("UserName is : " + date.get(1).get(0));
        System.out.println("UserName is : " + date.get(1).get(1));
        System.out.println(" ");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("I should see the userform page");
    }
}
