package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Sujana\\Softwares\\browserdrivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Sujana\\Softwares\\browserdrivers\\msedgedriver.exe");
		EdgeDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("http://www.ebay.com");
		edgeDriver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		edgeDriver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		edgeDriver.close();

	}

}
