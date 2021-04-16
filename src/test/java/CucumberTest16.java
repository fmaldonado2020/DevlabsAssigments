import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//16- Automate below cucumber scenario -
public class CucumberTest16 {
    WebDriver driver = null;

    @Given("I have open the browser$")
    public void openBrowser() {
        driver = new FirefoxDriver();
    }

    @When("Open test website")
    public void gotoWeb() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    @Then("Scenario 1")
    public void loginButton() {
        if(driver.findElement(By.id("txtUsername")).isEnabled()) {
            driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
            driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");

            driver.findElement(By.id("btnLogin")).click();
        } else {
            System.out.println("Test 1 Fail");
        }
        driver.close();
    }
}
