package steps;

import utility.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageLocators;

public class Login {

    WebDriver driver; // ✅ Getting driver from Base class
    LoginPageLocators loginPageLocators;
    
    @Given("user redirects to the saucedemo {string}")
    public void userRedirectsToLoginPage(String url) {
    	driver = Base.getDriver();
    	loginPageLocators= new LoginPageLocators(driver);
    	driver.get(url);
        System.out.println("User redirected to: " + url);
    }

    @When("user enter the correct username")
    public void user_enter_the_correct_username() {
    	loginPageLocators.userName().sendKeys("standard_user");
       // driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("user enters the correct password")
    public void user_enters_the_correct_password() {
      
    	loginPageLocators.password().sendKeys("secret_sauce");
    	//  driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user click on Login button")
    public void user_click_on_login_button() {
        loginPageLocators.loginButton().click();
    	//driver.findElement(By.id("login-button")).click();
    }

    @Then("user redirects to Inventory page")
    public void user_redirects_to_inventory_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"));
        System.out.println("User successfully logged in and landed on Inventory page.");
    }
}
