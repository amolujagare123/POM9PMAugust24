package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static utility.ConfigReader.getBrowser;
import static utility.ConfigReader.getUrl;

public class OpenURL {

    public static WebDriver driver;
    @BeforeClass
    public void openURL() throws IOException {

        switch (getBrowser())
        {
            case "chrome" :driver = new ChromeDriver();
                           break;
            case "firefox" :driver = new FirefoxDriver();
                break;

            case "edge" :driver = new EdgeDriver();
                break;
        }


        driver.manage().window().maximize();
        driver.get(getUrl());
    }

    public static  WebDriver getDriver()
    {
       return driver  ;
    }
}
