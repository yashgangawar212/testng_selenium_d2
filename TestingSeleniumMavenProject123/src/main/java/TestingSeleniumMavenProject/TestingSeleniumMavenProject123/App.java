package TestingSeleniumMavenProject.TestingSeleniumMavenProject123;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		driver.get("https://selenium.dev");

		String PgTitle = driver.getTitle();
		System.out.println(PgTitle);
	}
}