package Cucmber_test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class StepDef
{static WebDriver wb=null;
    static {

        System.setProperty("webdriver.chrome.driver","B:\\setup for selenium\\chromedriver_win32\\chromedriver.exe");
        wb=new ChromeDriver();
    }
    @Given("^enter url$")
    public void enter_url()  {
wb.get("http://qaerp.franciscanecare.net/Secure/");

    }

    @Then("^enter username and password$")
    public void enter_username_and_password()  {
wb.findElement(By.id("txtUserName")).sendKeys("admin");
wb.findElement(By.id("txtPassword")).sendKeys("Admin#franciscan");

    }

    @Then("^click on login$")
    public void click_on_login()  {
wb.findElement(By.id("btnLogin")).click();
    }
    @Given("^enter urll$")
    public void enter_urll()  {
        wb.get("http://qaerp.franciscanecare.net/Secure/");
    }

    @Then("^enter usernamee and passwordd$")
    public void enter_usernamee_and_passwordd(){
        wb.findElement(By.id("txtUserName")).sendKeys("admin1");
        wb.findElement(By.id("txtPassword")).sendKeys("Admin#franciscan");

    }

    @Then("^click on loginn$")
    public void click_on_loginn()  {
        wb.findElement(By.id("btnLogin")).click();

    }


}
