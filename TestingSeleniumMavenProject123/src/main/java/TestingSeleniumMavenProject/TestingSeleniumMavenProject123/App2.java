package TestingSeleniumMavenProject.TestingSeleniumMavenProject123;
import org.openqa.selenium.WebDriver;

public class App2 {
			WebDriver driver;

			public void init(WebDriver driver ) {
				this.driver = driver;
			}
			public void InvokeAwesomeQaApp() {
				driver.get("https://www.awesomeqa.com/ui");
			}
			public String AwesomeHome_PageTitle() {
				String pgTitleHome = driver.getTitle();
				return pgTitleHome;
			}
}