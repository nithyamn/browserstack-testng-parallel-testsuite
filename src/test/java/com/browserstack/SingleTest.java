package com.browserstack;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.management.BufferPoolMXBean;
import java.net.URL;

public class SingleTest extends BrowserStackTestNGTest{

    @Test
    public void test() throws Exception {
        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));

        element.sendKeys("iphone 11 plus");
        element.submit();
        Thread.sleep(5000);
        //REST API
        String title = driver.getTitle();

        SessionId session = ((RemoteWebDriver) driver).getSessionId();
        if(title.equals("BrowserStack - Google Search"))
            TestStatus.mark(session,"passed");
        else
            TestStatus.mark(session,"failed");
        /*driver.get("https://dashboard.development.pendata-dev.dwpcloud.uk/rp/opp-aow?spncspo");
        Thread.sleep(5000);
        driver.quit();*/
    }
}

