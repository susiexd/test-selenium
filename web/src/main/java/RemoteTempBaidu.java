import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTempBaidu {

    public static void main(String[] args) {

        final String sUrl = "http://www.baidu.com/";

        //System.setProperty("webdriver.ie.driver","C:\\Program Files\\internet explorer\\IEDriverServer.exe");

        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        RemoteWebDriver oWebDriver = null;
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

        try {
            oWebDriver = new RemoteWebDriver(new URL("http://192.168.205.1:4444/wd/hub"), ieCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //WebDriver oWebDriver = new InternetExplorerDriver(ieCapabilities);

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

        //oWebDriver.close();

    }

}