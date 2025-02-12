package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;

public class ResourceFile {
    private WebDriver driver;
    private static ResourceFile myObj;
    // public static WebDriver driver;
    PropertyFileReader property = new PropertyFileReader();

    public static ResourceFile getInstance() {
        if (myObj == null) {
            myObj = new ResourceFile();
            return myObj;
        } else {
            return myObj;
        }
    }

    //get the selenium driver
    public WebDriver getDriver() {
        return driver;
    }

    //when selenium opens the browsers it will automatically set the web driver
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static void setMyObj(ResourceFile myObj) {
        ResourceFile.myObj = myObj;
    }

    public void openBrowser() {

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //System.setProperty("webdriver.chrome.driver",getChromeDriverFilePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigateToURL() {
        String url = property.getProperty("config", "url");
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();

    }

    public WebElement waitUntilNextElementAppears(By locator, int timeOut) {
        WebElement element = new WebDriverWait(ResourceFile.getInstance().getDriver(), Duration.ofSeconds(timeOut)).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }


    public void setText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    /*private String getChromeDriverFilePath() {
        URL res = getClass().getClassLoader().getResource("chromedriver.exe");
        File file = null;
        try {
            file = Paths.get(res.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }*/
}
