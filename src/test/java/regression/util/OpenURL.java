package regression.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static utility.ConfigReader.getUrl;

public class OpenURL {

    public static WebDriver driver;
    @BeforeClass
    public void openURL() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());
    }

    public static  WebDriver getDriver()
    {
       return driver  ;
    }
}
