package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static javax.swing.UIManager.get;

public class ContactCreationTests extends TestBase {

    ContactData cd = new ContactData("fist", "midle", "last", "adress", "home", "work",
            "mobile", "email","1980","January","2");

    @Test
    public void ContactCreationTest() throws Exception {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillOutContactForm(cd);
    }

    @Test
    public void contactCreationTest2() throws Exception {
        cd.first = "second";
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillOutContactForm(cd);
    }

    @Test
    public void contactDelitionTest() throws Exception {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectAllContacts();
        app.acceptNextAlert = true;
        app.getContactHelper().confirmDeletion();
        app.closeAlertAndGetItsText();

    }

    @Test
    public void selectAll() {
        app.selectAllElements();
    }
}
