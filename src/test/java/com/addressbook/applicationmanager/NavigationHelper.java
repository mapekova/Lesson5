package com.addressbook.applicationmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;
    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }
    public void goToHomePage() {
        driver.findElement(By.linkText("home")).click();
    }

    public void goToGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }
    public void goToBirthdayPage (){
        driver.findElement(By.linkText("next birthdays")).click();
    }
}
