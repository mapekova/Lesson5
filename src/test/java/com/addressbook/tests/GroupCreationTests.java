
package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {
    private String baseUrl;


    @Test
    public void groupCreationTest() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        // for (int i=0; i<20; i++) {
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("marianna", "ape", "footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        // }

    }

    @Test
    public void groupDeletionTest() throws Exception {

        app.getNavigationHelper().goToGroupPage();
        app.selectElements();
        app.deleteElements();

    }

}
