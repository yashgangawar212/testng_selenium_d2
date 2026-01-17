package TestingSeleniumMavenProject.TestingSeleniumMavenProject123;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Awesomeng {

	WebDriver driver =  new EdgeDriver();

	App2 pg1 = new App2();

	String Exp_HomePgTitleIs="Your Store";

	@Test(priority=1)
	public void InvokeApp_Awesome() {
		pg1.init(driver);
		pg1.InvokeAwesomeQaApp();
		// String HomepgTitleIs = pg1.AwesomeHome_PageTitle();
		// System.out.println("HomePgTitleIs" +" "+ HomepgTitleIs);
	}
	@Test (priority=2)
	public void Fetch_And_Validate_Title() {
		String HomepgTitleIs = pg1.AwesomeHome_PageTitle();
		System.out.println("HomePgTitleIs " + " " + HomepgTitleIs);

		Assert.assertEquals(HomepgTitleIs, Exp_HomePgTitleIs);
	}
}
