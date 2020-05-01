package Commonpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Managefactory.ManageAdvanceSearch;
import Managefactory.ManageAllViews;
import Managefactory.Managedashboard;
import Commonpage.PropertyReader;
import constants.GlobalConstant;
import constants.GlobalConstant.Filename;


public class DrivetestCase {
	
	protected WebDriver driver;
	
	protected static final int DEFAULT_WAIT_4_ELEMENT = 50;
	protected PropertyReader configreader =new PropertyReader(Filename.CONFIG.tosString());
	protected String application_url =configreader.readapplicationfile("AGENT_URL");
	protected String username = configreader.readapplicationfile("USERNAME");
	protected String password = configreader.readapplicationfile("PASSWORD");
	protected String dealercodeforagent = configreader.readapplicationfile("DEALERCODE");
	protected String salescodeforagent = configreader.readapplicationfile("SALESCODE");
	protected String projectnameforagent = configreader.readapplicationfile("PROJECTNAME");
	
	public static Managedashboard managedashboard;
	public static ManageAllViews manageallviews;
	public static ManageAdvanceSearch manageadvancesearch;
	@BeforeMethod
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj.mathpal\\eclipse-workspace\\Pro\\src\\Driver\\chromedriver.exe");
   	    driver = new ChromeDriver();
   	    driver.manage().deleteAllCookies();
   	    getWebdriver().navigate().to(application_url);
        managedashboard = PageFactory.initElements(getWebdriver(), Managedashboard.class);
        manageallviews = PageFactory.initElements(getWebdriver(), ManageAllViews.class);
        manageadvancesearch = PageFactory.initElements(getWebdriver(), ManageAdvanceSearch.class);
        
	}
	
	 @AfterMethod 
	  public void getResult(ITestResult result) throws Throwable 
	 {
	 if(result.getStatus() == ITestResult.SUCCESS) 
	 { String screenShotPath = ExtentTestManager.getScreenhot(driver, result.getName());
	 ExtentTestManager.getTest().addScreenCaptureFromPath(screenShotPath);
	 driver.close();
	 }
	 else if
	 (result.getStatus() == ITestResult.FAILURE)
	 { String screenShotPath =
	  ExtentTestManager.getScreenhot(getWebdriver(), result.getName());
	  ExtentTestManager.getTest().addScreenCaptureFromPath(screenShotPath);  
	  driver.close();
	  } 
	 ExtentTestManager.endTest(); }
	
	public WebDriver getWebdriver()
	{
		return this.driver;
	}

}
