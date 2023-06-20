import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.Assert;
import java.time.Duration;
import java.util.UUID;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest {

@Test
public void deletePlaylist() throws InterruptedException {
    String deletedPlaylistMsg = "Deleted playlist";

    provideEmail("demo.class@gmail.com");
    providePassword("te$t$tudent");
    clickSubmit();
//    Thread.sleep(2000);
    openPlaylist();
//    Thread.sleep(2000);
    clickDeletePlaylistBtn();
    Assert.assertTrue(getDeletedPlaylistMsg().contains(deletedPlaylistMsg));
}
    public void openPlaylist () {
        WebElement emptyPlaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));

//      WebElement emptyPlaylist = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
        emptyPlaylist.click();
    }

    public void clickDeletePlaylistBtn() throws InterruptedException {
        WebElement deletePlaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-delete-playlist")));

//        WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deletePlaylist.click();
//        Thread.sleep(2000);
    }
    public String getDeletedPlaylistMsg(){
        WebElement notificationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));

//        WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
        return notificationMsg.getText();
    }
}
