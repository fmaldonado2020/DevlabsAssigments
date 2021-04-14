package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObjects {
    public WebDriver myDriver;

    public LoginPageObjects(WebDriver myDriver) {
        this.myDriver = myDriver;
    }
    // ================================================== BY VARIABLE SECTION =============================================================
    

    private final By selectorForUserTextBox = By.xpath("//input[@id='txtUsername']");

    private final By selectorForForPasswordTextBox = By.cssSelector("#txtPassword");

    private final By selectorForLoginButton = By.name("Submit");

    private final By selectorForLinkedIn = By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='footer']/div[@id='social-icons']/a[1]/img[1]");

    private final By selectorForForFacebook = By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='footer']/div[@id='social-icons']/a[2]/img[1]");



    // ================================================== ACTION OBJECT SECTION =============================================================

    public void Login(){
        WebElement weElement = myDriver.findElement(selectorForUserTextBox);
        weElement.sendKeys("Admin ");
        weElement = myDriver.findElement(selectorForForPasswordTextBox);
        weElement.sendKeys("admin123");

        weElement = myDriver.findElement(selectorForLoginButton);
        weElement.click();
    }



}
