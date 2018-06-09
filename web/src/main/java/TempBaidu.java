import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class TempBaidu {

    public static void main(String[] args) {

        final String sUrl = "http://www.baidu.com/";

        System.setProperty("webdriver.ie.driver","C:\\Program Files\\internet explorer\\IEDriverServer.exe");

        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

        WebDriver oWebDriver = new InternetExplorerDriver(ieCapabilities);

        oWebDriver.get(sUrl);

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

        // Use name locator to identify the search input field.

        WebElement oSearchInputElem = oWebDriver.findElement(By.name("wd"));

        oSearchInputElem.sendKeys("杨海华");

        WebElement oGoogleSearchBtn = oWebDriver.findElement(By.id("su"));

        oGoogleSearchBtn.click();

        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        oWebDriver.findElement(By.id("content_left")).findElement(By.id("1")).findElement(By.tagName("a")).click();

        System.out.print("" + oWebDriver.getPageSource());
        //oWebDriver.close();

    }

}