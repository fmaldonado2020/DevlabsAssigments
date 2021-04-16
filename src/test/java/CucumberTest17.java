import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//17- Automate another cucumber scenario
public class CucumberTest17 {
    WebDriver driver = null;

    @Given("I have open the browser$")
    public void openBrowser() {
        driver = new FirefoxDriver();
    }

    @When("Open test website")
    public void gotoWeb() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    @Then("scenario 2")
    public void loginButton() {
        if(driver.findElement(By.id("txtUsername")).isEnabled()) {
            driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
            driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");

            driver.findElement(By.id("btnLogin")).click();

            driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
            driver.findElement(By.id("menu_admin_Job")).click();
            Assert.assertEquals( driver.findElement(By.id("menu_admin_viewJobTitleList")).getText(), "Job Title");


        } else {
            System.out.println("Test 2 Fail");
        }
        driver.close();
    }
}
