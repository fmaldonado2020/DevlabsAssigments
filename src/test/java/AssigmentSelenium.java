
import Base.Base;
import PageObjects.LoginPageObjects;
import PageObjects.PIMPageObject;
import PageObjects.TopMenuPageObject;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenersTest.class)
public class AssigmentSelenium extends Base implements ITestListener {
    LoginPageObjects loginPageObjects;
    TopMenuPageObject topMenuPageObject;
    PIMPageObject pimPageObject;

    @BeforeClass
    public void beforeClass() {
        loginPageObjects = new LoginPageObjects(myDriver);
        topMenuPageObject = new TopMenuPageObject(myDriver);
        pimPageObject = new PIMPageObject(myDriver);
    }


    @AfterClass
    public void afterClass() {
        //selenium have no built in function to minimize the browser
        myDriver.manage().window().setPosition(new Point(-2000, 0));
    }


    @Test(priority = 1)
    public void assigmentTest() {
        System.out.println("Title: " + myDriver.getTitle());
        loginPageObjects.Login();
        Shutterbug.shootPage(myDriver).save();


        Assert.assertEquals(myDriver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        topMenuPageObject.validatetextInDashBoard();

        topMenuPageObject.clickOnTopMenuOption("PIM");
        pimPageObject.searchEmployee();

    }

    @Test(priority = 2, dependsOnMethods = "assigmentTest")
    public void assigmentTest2() {

        myDriver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        topMenuPageObject.clickOnTopMenuOption("Admin");
        topMenuPageObject.validateElementsOfAdmin();
    }



    /*
    14- Write CSS Selector of highlighted Rectangular object (in Red) in below Image
    CSS SELECTORS:
    1. #menu_pim_viewPimModule
    2. #menu_time_viewTimeModule
    3. #menu_maintenance_purgeEmployee
    4. .quickLaunge
    5. .quickLaunge
    6. .flot-overlay
    */

    /*
    15- 15- Write Xpath Selector of highlighted Rectangular object (in Red) in below –
    XPATH:
    1. //b[contains(text(),'Admin')]
    2. //input[@id='MP_link']
    3. //a[@id='welcome']
    4. //tbody/tr[1]/td[2]/div[1]/a[1]/img[1]
    */
}
