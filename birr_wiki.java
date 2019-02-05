
package Selenium_project;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
    public AppTest() {
    }

    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement element = driver.findElement(By.id("searchInput"));
        element.sendKeys(new CharSequence[]{"Birr, County Offaly"});
        WebElement search = driver.findElement(By.name("go"));
        search.click();
        WebElement hurling = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/div[3]/ul/li[6]/ul/li[1]/a/span[2]"));
        hurling.click();
    }
}
