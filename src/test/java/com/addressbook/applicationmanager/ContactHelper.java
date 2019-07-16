package com.addressbook.applicationmanager;

import com.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ContactHelper {
    private WebDriver driver;
    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement getByName(String param){
        return driver.findElement(By.name(param));

    }

    public void fillOutContactForm(ContactData contactData) {
        getByName("firstname").clear();
        getByName("firstname").sendKeys(contactData.getFirst());
        getByName("theform").click();
        getByName("middlename").click();
        getByName("middlename").clear();
        getByName("middlename").sendKeys(contactData.getMidle());
        getByName("theform").click();
        getByName("lastname").click();
        getByName("lastname").clear();
        getByName("lastname").sendKeys(contactData.getLast());
        getByName("theform").click();
        getByName("address").click();
        getByName("address").clear();
        getByName("address").sendKeys(contactData.getAdress());
        getByName("home").click();
        getByName("home").clear();
        getByName("home").sendKeys(contactData.getHome());
        getByName("work").click();
        getByName("work").clear();
        getByName("work").sendKeys(contactData.getWork());
        getByName("mobile").click();
        getByName("mobile").clear();
        getByName("mobile").sendKeys(contactData.getMobile());
        getByName("email").click();
        getByName("email").clear();
        getByName("email").sendKeys(contactData.getEmail());
        getByName("theform").click();
        getByName("homepage").click();
        getByName("homepage").clear();
        getByName("homepage").sendKeys("homepage");
        getByName("bday").click();
       // new Select(getByName("bday")).selectByVisibleText(contactData.getDay());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[4]")).click();
        getByName("bmonth").click();
       // new Select(getByName("bmonth")).selectByVisibleText(contactData.getMonth());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[35]")).click();
        getByName("byear").click();
        getByName("byear").clear();
        getByName("byear").sendKeys(contactData.getYear());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
    }

    public void initContactCreation() {
        driver.findElement(By.linkText("add new")).click();
    }
    public void confirmDeletion() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select all'])[1]/following::input[2]")).click();
    }

    public void selectAllContacts() {
        driver.findElement(By.id("MassCB")).click();
    }
}

