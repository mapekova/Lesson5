package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class BirthdayTest extends TestBase {
    ContactData cd = new ContactData("fist", "midle", "last", "adress", "home", "work",
            "mobile", "email","1980","January","2");

    @Test
    public void testBirthday() throws Exception {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillOutContactForm(cd);
        app.getNavigationHelper().goToBirthdayPage();
    }

}
