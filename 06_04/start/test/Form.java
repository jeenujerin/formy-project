
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert.*;



public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Jeenu automation\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage= new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmPage=new ConfirmationPage();

        confirmPage.waitForAlertBanner(driver);

        Assert.assertEquals("The form was successfully submitted!", confirmPage.getAlertBannerText(driver));

        driver.quit();
    }

}
