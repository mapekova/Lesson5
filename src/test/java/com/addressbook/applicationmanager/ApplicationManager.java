package com.addressbook.applicationmanager;

import com.addressbook.SelenoidWebDriverProvider;
import org.openqa.selenium.*;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    private ContactHelper contactHelper;
    private WebDriver driver;
    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    public boolean acceptNextAlert = true;
    private SelenoidWebDriverProvider swdp = new SelenoidWebDriverProvider();
    private StringBuffer verificationErrors = new StringBuffer();

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public void init() {
        driver = swdp.createDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(driver);
        sessionHelper = new SessionHelper(driver);
        contactHelper = new ContactHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        sessionHelper.logout();
        driver.quit();

        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }


    public void deleteElements() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectElements() {
        List<WebElement> elements = deleteSetedElemenets();
        if (elements.size() > 0) {
            for (int i = 0; i < elements.size(); i++) {
                elements.get(i).click();
            }
        }
    }

    public List<WebElement> deleteSetedElemenets() {
        return driver.findElements(By.name("selected[]"));
    }

    public void selectAllElements() {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        driver.findElement(By.linkText("home")).sendKeys(selectAll);
    }


    public void elementHighlight(WebElement element) {
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "color: black; background: gray; border: 3px solid gray;");

        }
    }

    public List<WebElement> getElementByLink(List<String> selectors) {
        List<WebElement> webElements = new LinkedList<>();
        for (int i = 0; i < selectors.size(); i++) {
            webElements.add(driver.findElement(By.linkText(selectors.get(i))));

        }

        return webElements;

    }
}
