import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

public class LanguageSwitcher {

    @Test
    @Parameters({"Language"})
    public void colorOfLanguageSwitcherChanged(@Optional String lan) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa-test\\Documents\\kehc\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        if (lan == null) {
            lan = "en";
        }
//        driver.findElement(By.id("languageSelectField"));

        String url = "https://www.marathonbet.com/" + lan + "/";
        driver.get(url);


        Actions action = new Actions(driver);
        WebElement languageSwitcher = driver.findElement(By.id("languageSelectField"));
        WebElement languageLabel = languageSwitcher.findElement(By.className("menu-link"));

        String initialColour = languageLabel.getCssValue("color");
        Assert.assertEquals(initialColour,"rgba(255, 255, 255, 1)", "Colour should be white");

        action.moveToElement(languageSwitcher).build().perform();

        String finalColour = languageLabel.getCssValue("color");
        Assert.assertEquals(finalColour,"rgba(255, 242, 0, 1)", "Colour should be yellow");

        driver.quit();

    }

    @Test
    @Parameters({"Language"})
    public void colorOfLanguageSwitcherChangedSoftAssert(@Optional String lan) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa-test\\Documents\\kehc\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        if (lan == null) {
            lan = "en";
        }
//        driver.findElement(By.id("languageSelectField"));

        String url = "https://www.marathonbet.com/" + lan + "/";
        driver.get(url);

        SoftAssert softAssert = new SoftAssert();

        Actions action = new Actions(driver);
        WebElement languageSwitcher = driver.findElement(By.id("languageSelectField"));
        WebElement languageLabel = languageSwitcher.findElement(By.className("menu-link"));

        String initialColour = languageLabel.getCssValue("color");
//        Assert.assertEquals(initialColour,"rgba(255, 255, 255, 1)", "Colour should be white");

        softAssert.assertEquals(initialColour,"rgba(255, 255, 255, 1)", "Colour should be white");


        action.moveToElement(languageSwitcher).build().perform();

        String finalColour = languageLabel.getCssValue("color");
//        Assert.assertEquals(finalColour,"rgba(255, 242, 0, 1)", "Colour should be yellow");
        softAssert.assertEquals(finalColour,"rgba(255, 242, 0, 1)", "Colour should be yellow");

        softAssert.assertAll();

        driver.quit();

    }

}