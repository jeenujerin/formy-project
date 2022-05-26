import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Jeenu automation\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name= driver.findElement(By.id("name"));
        Actions actions =new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Jeenu Joy");
        WebElement date= driver.findElement(By.id("date"));
        name.sendKeys("01/09/2021");

        driver.quit();
    }
}
