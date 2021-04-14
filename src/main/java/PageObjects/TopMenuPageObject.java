package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TopMenuPageObject {
    public WebDriver myDriver;

    public TopMenuPageObject(WebDriver myDriver) {
        this.myDriver = myDriver;
    }


    public void clickOnTopMenuOption(String option){
        WebElement weElement = myDriver.findElement(By.xpath("//b[contains(text(),'"+ option +"')]"));
        weElement.click();
    }

    public void validateElementsOfAdmin(){
        WebElement weElement = myDriver.findElement(By.id("menu_admin_UserManagement"));
        Assert.assertEquals(weElement.getText(),"User Management");

        weElement = myDriver.findElement(By.id("menu_admin_Job"));
        Assert.assertEquals(weElement.getText(),"Job");

        weElement = myDriver.findElement(By.id("menu_admin_Organization"));
        Assert.assertEquals(weElement.getText(),"Organization");

        weElement = myDriver.findElement(By.id("menu_admin_Qualifications"));
        Assert.assertEquals(weElement.getText(),"Qualifications");

        weElement = myDriver.findElement(By.id("menu_admin_nationality"));
        Assert.assertEquals(weElement.getText(),"Nationalities");
    }

    public void validatetextInDashBoard(){
        Assert.assertEquals(myDriver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText(),"Dashboard");
    }


}
