package com.addressbook.tests;

import com.addressbook.applicationmanager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected  ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();

    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }


}
