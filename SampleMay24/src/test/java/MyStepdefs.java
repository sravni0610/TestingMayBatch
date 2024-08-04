import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {

    WebDriver driver;

    @Before
    public void start(){
        driver = TestRunner.driver;
    }

    @Given("User navigates to the application")
    public void userNavigatesToTheApplication() {
       String acttitle= driver.getTitle();
       String exptitle = "OrangeHRM";
        Assert.assertEquals(exptitle,acttitle);
    }

    @When("User clicks on POM option")
    public void userClicksOnPOMOption() {

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

    }

    @And("User clicks on EMployee List")
    public void userClicksOnEMployeeList() {

        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
    }

    @Then("User is able to see Employee information")
    public void userIsAbleToSeeEmployeeInformation() {
        String actdata= driver.findElement(By.xpath("//*[contains(text(),'Employee Information')]")).getText();
        String expdata = "Employee Information";
        Assert.assertEquals(expdata,actdata);

    }

    @When("User enters login details")
    public void userEntersLoginDetails() {

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.id("btnLogin")).click();
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String userid, String password) {

        driver.findElement(By.id("txtUsername")).sendKeys(userid);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();

    }
}
