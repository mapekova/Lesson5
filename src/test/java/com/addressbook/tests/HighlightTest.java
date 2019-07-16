package com.addressbook.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class HighlightTest extends TestBase {
    @Test
    public void highlight() {
        List<String> selectors = new LinkedList<String>();
        selectors.add("home");
        selectors.add("add new");
        selectors.add("groups");
        selectors.add("next birthdays");
        selectors.add("print all");
        selectors.add("print phones");
        selectors.add("map");
        selectors.add("export");
        selectors.add("import");


        List<WebElement> webElements = app.getElementByLink(selectors);
        for (int i = 0; i < webElements.size(); i++) {
            app.elementHighlight(webElements.get(i));

        }
        assert (webElements.size() == 9);

        System.out.println(webElements.size());
    }

}

