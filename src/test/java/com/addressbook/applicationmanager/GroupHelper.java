package com.addressbook.applicationmanager;

import com.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GroupHelper {
    private WebDriver driver;
    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    public void editGroup() {


        driver.findElement(By.name("edit")).click();
    }
    public void selectGroup(){
        driver.findElement(By.name("selected[]")).click();

    }
    public void selectGroups() {
        List<WebElement> elements = driver.findElements(By.name("selected[]"));
        System.out.println("elements.size() = " + elements.size());
        if (elements.size() > 0) {
            for (int i = 0; i < elements.size(); i++) {
                elements.get(i).click();
            }
        }
    }
    public void submitGroupUpdate(){
        driver.findElement(By.name("update")).click();
    }

    public void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }
}
