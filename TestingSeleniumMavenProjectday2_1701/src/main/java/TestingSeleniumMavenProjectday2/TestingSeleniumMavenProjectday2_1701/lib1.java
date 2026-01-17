package TestingSeleniumMavenProjectday2.TestingSeleniumMavenProjectday2_1701;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class lib1 {
	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver = driver;
		}
	public String launchCart() {
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");
		String logTitle = driver.getTitle(); return logTitle;
		}
	
	public String logAssert(String email, String password) {
		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		
		String confirmMess = driver.findElement(By.xpath("//*[contains(text(),'My Orders')]")).getText();
		return confirmMess;
		}
	}