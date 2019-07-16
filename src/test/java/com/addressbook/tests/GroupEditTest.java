package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupEditTest extends TestBase {
    @Test
    public void groupfDeleteEdit() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().deleteGroup();

    }

    @Test
    public void groupCreationTest() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        for (int i=0; i<5; i++) {
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("marianna", "ape", "footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        }

    }

    @Test
    public void groupEditTest() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("mariannaEdit", "apeEdit", "footerEdit"));
        app.getGroupHelper().submitGroupUpdate();

    }

}

