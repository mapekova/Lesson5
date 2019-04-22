
package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {
    private String baseUrl;


    @Test
    public void groupCreationTest() throws Exception {
        app.goToGroupPage();
        // for (int i=0; i<20; i++) {
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("marianna", "ape", "footer"));
        app.submitGroupCreation();
        app.returnToGroupPage();
        // }

    }

    @Test
    public void groupDeletionTest() throws Exception {

        app.goToGroupPage();
        app.selectElements();
        app.deleteElements();

    }

}
