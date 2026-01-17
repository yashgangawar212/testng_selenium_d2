package TestingSeleniumMavenProjectday2.TestingSeleniumMavenProjectday2_1701;

import org.testng.annotations.Test;
import org.testng.Assert;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class lib2 {
 
	lib1 s1 = new lib1();
    WebDriver driver = new ChromeDriver();
    String Expected = "My Orders";
 
    @Test()

    public void testLogin() {
        s1.init(driver);
        s1.launchCart();
        String logStr = s1.logAssert("yash.gangwar@example.com", "user12");
        Assert.assertEquals(logStr, Expected);
    }
}