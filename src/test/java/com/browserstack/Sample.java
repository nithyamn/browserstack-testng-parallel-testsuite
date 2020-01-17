package com.browserstack;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Sample {

    @Test
    public void test() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/nithyamani/Desktop/chromedrivers/chromedriver 79");

        // Initialize browser
        //DesiredCapabilities caps = new DesiredCapabilities();
        DesiredCapabilities caps = new DesiredCapabilities().chrome();
        caps.setCapability("browserName", "chrome");
        caps.setCapability("acceptSslCerts", "true");

        WebDriver driver = new ChromeDriver(caps);
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
        driver.get("https://expired.badssl.com/");
        Thread.sleep(5000);
        driver.quit();
    }
}
