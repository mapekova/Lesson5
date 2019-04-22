package com.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTest() throws Exception {
        app.initContactCreation();
        app.fillOutContactForm("first", "midle", "last", "adress", "home", "work", "mobile", "email");
    }

    @Test
    public void ContactDelitionTest() throws Exception {
        app.goToHomePage();
        app.selectAllContacts();
        app.acceptNextAlert = true;
        app.confirmDeletion();
        app.closeAlertAndGetItsText();

    }

}
