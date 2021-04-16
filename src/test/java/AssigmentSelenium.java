
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

//1- Open the above URL in Chrome browser. ---- This is done in the base class

//3- Write Xpath and CssSelector of login page for following web objects - All Text box’s, All - Hyperlinks, All Images. ---- this is done one page object class src/main/java/PageObjects/LoginPageObjects.java

//6- Launch a browser in @Beforesuite annotation and open url . url ------ This is done in the base class --> src/main/java/Base/Base.java

//11- Implement ITestListener for above scenario where full-page screenshot needs to be capture where ever test is pass or failed. Hint – Please use Shutterbug /class
//test listener is done in src/test/java/ListenersTest.java

//12- Implement Retry analyzer – retry 3 times only for the above scenario.
//@Listeners({ListenersTest.class, RetryAnalyzerTest.class})
@Listeners({ListenersTest.class})
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
        //9- Write a method (avoid using Test annotation) to minimize the window
        //selenium have no built in function to minimize the browser
        myDriver.manage().window().setPosition(new Point(-2000, 0));
    }

    //7- Login to application again in @Test method, set priority 1 of the same method Afterlogging
    //13- Execute followingscenario
    @Test(priority = 1)
    public void assigmentTest() {

        //2- Print the title of this application.
        System.out.println("Title: " + myDriver.getTitle());

        //4- Login with given User Name and Password and validate Dashboard.
        loginPageObjects.Login();
        Shutterbug.shootPage(myDriver).save();


        Assert.assertEquals(myDriver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");


        //10- Read Dashboard heading using [driver.findelement(by.xpath()).gettext()]
        topMenuPageObject.validatetextInDashBoard();

        //8- Write Test method and page title for different menus- in order(Admin, PIM, Leave Dashboard, Directory and Maintenance)
        topMenuPageObject.clickOnTopMenuOption("PIM");
        pimPageObject.searchEmployee();

    }

    //13- Execute followingscenario
    @Test(priority = 2, dependsOnMethods = "assigmentTest")
    public void assigmentTest2() {

        myDriver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        //5- Click on Admin Link in Home Page and validate following text-
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
