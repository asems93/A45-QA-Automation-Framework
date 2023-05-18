import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSongTest() throws InterruptedException {

        navigateToPage();
        provideEmail("demo.class@gmail.com");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(2000);

        WebElement playNextButton = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        playNextButton.click();

        WebElement playButton = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));
        playButton.click();
        Thread.sleep(2000);


        WebElement soundBar = driver.findElement(By.xpath("//div[@data-testid='sound-bar-play']"));
        soundBar.isDisplayed();
        Thread.sleep(3000);

    }

    }


