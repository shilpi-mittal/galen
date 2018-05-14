import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.GalenTestBase;

import java.io.IOException;

/**
* Created by shmittal on 7/20/17.
*/
public class WelcomePageTest extends GalenTestBase {

    @Test(dataProvider = "devices")
    public void welcomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        checkLayout(System.getProperty("user.dir") + "\\src\\test\\resources\\welcomePage.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void loginPage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        getDriver().findElement(By.xpath("//button[.='Login']")).click();
        checkLayout(System.getProperty("user.dir") + "\\src\\test\\resources\\loginPage.spec", device.getTags());
    }

}