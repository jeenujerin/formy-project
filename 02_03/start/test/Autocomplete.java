import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Jeenu automation\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement search = driver.findElement(By.id("autocomplete"));
        search.click();
        search.sendKeys("20499 64 Ave, Langley, BC V2Y 1N5");
        Thread.sleep(1000);
        WebElement dismissButton= driver.findElement(By.className("dismissButton"));
        dismissButton.click();

        driver.quit();
    }
}
