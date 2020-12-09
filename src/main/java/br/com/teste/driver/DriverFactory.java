package br.com.teste.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver(String link) {
		if (driver == null) {
		System.setProperty("webdriver.gecko.driver", "./files/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void quit() {

		if (driver != null)
			driver.quit();
		driver = null;
	}
}
