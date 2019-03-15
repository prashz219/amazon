package com.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Page {

	/*
	 * Initializing WebDriver Logs WebDriverWait ExtentReports ExcelReader
	 * 
	 * 
	 */

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static String browser;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	@BeforeSuite
	public void setUp() {


		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			config.load(fis);
			log.debug("Config file loaded !!!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		if (config.getProperty("browser").equals("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		log.debug("Launching Chrome");
		} else if (config.getProperty("browser").equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "gecko.exe");
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.debug("Launching Firefox");
		} else if (config.getProperty("browser").equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			
		}
		
		driver.get(config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void click(WebElement element) {

		element.click();
		log.debug("Clicking on an Element : "+element);
		//test.log(LogStatus.INFO, "Clicking on : " + element);
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();

	}

}
