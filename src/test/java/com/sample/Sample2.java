package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Sample2 {
    public static final String USERNAME = "nithyamani3";
    public static final String AUTOMATE_KEY = "P4JKysg5WuchQxBfKQu1";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void test() throws Exception {
        /*System.setProperty("webdriver.chrome.driver", "/Users/nithyamani/Desktop/chromedrivers/chromedriver 79");

        // Initialize browser
        //DesiredCapabilities caps = new DesiredCapabilities();
        DesiredCapabilities caps = new DesiredCapabilities().chrome();
        caps.setCapability("browserName", "chrome");
        caps.setCapability("acceptSslCerts", "true");

        WebDriver driver = new ChromeDriver(caps);
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
        driver.get("https://expired.badssl.com/");
        Thread.sleep(5000);
        driver.quit();*/
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "72.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("build", "Sample1 Testng");
        caps.setCapability("name", "sample_test_2");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("BrowserStack");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }
}
