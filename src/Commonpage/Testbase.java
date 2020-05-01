package Commonpage;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.aventstack.extentreports.Status;



public class Testbase extends DrivetestCase {
	
	protected WebDriver driver;
	
	public Testbase(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebDriver getWebDriver()
	{
		return driver;
	}
   
	public void waitforelement(WebElement element)
	{
		try
		{
			WebDriverWait wait =new WebDriverWait(driver, DEFAULT_WAIT_4_ELEMENT);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Exception e) {
			ExtentTestManager.getTest().log(Status.INFO, element.toString() + "element not present ot not clickable");	
		}
	}
	
	public void waitforvisibleelement(WebElement element)
	{
		try
		{
			WebDriverWait wait =new WebDriverWait(driver, DEFAULT_WAIT_4_ELEMENT);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch (Exception e) {
			ExtentTestManager.getTest().log(Status.INFO, element.toString() + "element not present ot not clickable");	
		}
	}
	
	public void waitandclick(WebElement element)
	{
		waitforelement(element);
		element.click();
	}

	 public void getalltext(WebElement e1)
	 {
		 if(e1.isDisplayed() || e1.isEnabled())
		 {
			 e1.getText();
		 }	
	 }
	 
	 public String gettextdata(WebElement e1)
	 {
		 String gettextdata = "";
		 if(e1.isDisplayed() || e1.isEnabled())
		 {
			 e1.getText().trim();
		 }
		 System.out.println(gettextdata);
		return gettextdata;
		
	 }
	 
	 
	 public void verifycompletetext(WebElement element, String text)
	 {
	    Assert.assertEquals(element.getText(), text);
		 
	 }
	 
	 
	 public void acceptalertpopup()
	 {
		 try
		 {
			 Alert alert = driver.switchTo().alert();
			 alert.accept();
		 }
		 catch (Exception e) {
			System.out.println("error in popup" + e.getMessage());
		}
	 }
	 public void dismissalertpopup()
	 {
		 try
		 {
			 Alert alert = driver.switchTo().alert();
			 alert.dismiss();
		 }
		 catch (Exception e) {
			System.out.println("error in popup" + e.getMessage());
		}
	 }
	 
	 public void selectvaluefromdropdown(WebElement element) throws InterruptedException
	 {
		 Select select = new Select(element);
		 List<WebElement> sizeoption = select.getOptions();
		 int ilistsize = sizeoption.size();
		 for(int i=0; i< ilistsize; i++)
		 {
			 String newvalue = select.getOptions().get(i).getText();
			 System.out.println(newvalue);
			 select.selectByIndex(i);
			 Thread.sleep(2000);
		 }
		
	 }
	 
	 public void scrolldown()
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
	 }
	 
}
