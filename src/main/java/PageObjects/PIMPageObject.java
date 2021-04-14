package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PIMPageObject {
    public WebDriver myDriver;

    public PIMPageObject(WebDriver myDriver) {
        this.myDriver = myDriver;
    }


    public void searchEmployee(){
        WebElement weElement = myDriver.findElement(By.id("empsearch_employee_name_empName"));
        weElement.sendKeys("Linda Anderson");
        weElement = myDriver.findElement(By.id("empsearch_id"));
        weElement.click();

        Assert.assertTrue( myDriver.findElement(By.xpath("//a[contains(text(),'Linda Jane')]")).getText().contains("Linda"));


    }



}
