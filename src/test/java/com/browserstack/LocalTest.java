package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("http://localhost:8000/");
        //Assert.assertTrue(driver.getPageSource().contains("Up and running"));
    }
}
