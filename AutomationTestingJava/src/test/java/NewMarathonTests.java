import helper.Dictionary;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class NewMarathonTests {private WebDriver driver;
    private String lang;

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("BeforeGroups");
    }

    @BeforeMethod
    @Parameters({"Language"})
    public void BeforeMethod(@Optional ("en") String lan){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa-test\\Documents\\kehc\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        if (lan == null){
            lan = "en";
        }
        String url = "https://www.marathonbet.com/" + lan + "/";
        driver.get(url);
        lang = lan;
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterMethod
    public void finish(){
        driver.quit();
    }

    @Test(groups = {"login", "regression"})
    public void negativeLogin() {
        //this.lan = lan;
        driver.findElement(By.id("auth_login")).sendKeys("Hellojh");
        driver.findElement(By.id("auth_login")).sendKeys(Keys.TAB);
        driver.findElement(By.id("auth_login_password")).sendKeys("hi");
        driver.findElement(By.className("login-pass")).findElement(By.className("btn-login")).click();

        String actualMessage = driver.findElement(By.id("any_message")).findElement(By.tagName("p")).getText();
        String realMessage = Dictionary.getTranslationForDoesntMeetReq(lang);
        String infoMessage = String.format("The message should be '%s'", realMessage);
        Assert.assertEquals(actualMessage, realMessage, infoMessage);
    }


    @Test(description = "Color changed", groups = {"css", "regression"})
    public void colorOfLanguageSwitcherChanged() {
        Actions action = new Actions(driver);
        WebElement languageSwitcher = driver.findElement(By.id("languageSelectField"));
        WebElement languageLabel = languageSwitcher.findElement(By.className("menu-link"));
        String initialColor = languageLabel.getCssValue("color");
        Assert.assertEquals(initialColor, "rgba(255, 255, 255, 1)", "Color should be white");
        action.moveToElement(languageSwitcher).build().perform();
        String finalColor = languageLabel.getCssValue("color");
        Assert.assertEquals(finalColor, "rgba(255, 242, 0, 1)", "Color should be yellow");
    }

    @Test(groups = {"css"})
    public void colorOfLanguageSwitcherChangedSoftAssert() {
        SoftAssert softAssert=new SoftAssert();
        Actions action = new Actions(driver);
        WebElement languageSwitcher = driver.findElement(By.id("languageSelectField"));
        WebElement languageLabel = languageSwitcher.findElement(By.className("menu-link"));
        String initialColour = languageLabel.getCssValue("colour");
        softAssert.assertEquals(initialColour,"rgba(255, 255, 255, 0)", "Colour should be white");
        action.moveToElement(languageSwitcher).build().perform();
        String finalColour = languageLabel.getCssValue("color");
        softAssert.assertEquals(finalColour,"rgba(255, 242, 55, 1)", "Colour should be yellow");
//        softAssert.assertAll();
    }
}
