package Managefactory;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.model.Test;


import Commonpage.Testbase;


public class Managedashboard extends Testbase {
	public Managedashboard(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "username")
	public WebElement txtUsername;

	@FindBy(id = "password")
	public WebElement txtPassword;

	@FindBy(xpath = "//button[@class='button button--primary']")
	public WebElement btnEnter;
	
	@FindBy(id = "dealer-code")
	public WebElement dealercode;
	
	@FindBy(id = "sales-rep-id")
	public WebElement salesid;
	
	@FindBy(xpath = "//a[text()='Continue']")
	
    public WebElement continuebutton;
	
	@FindBy(xpath = "//input[@name=\"customer-name\"]")
	public WebElement customername;
	
    @FindBy(xpath = "//a[text()='Continue']")
	
    public WebElement continuecontractbutton;
    
    @FindBy(xpath ="//h1[text()=\"Manhattan Project\"]")
    
    WebElement Manhattanproject;
    
    @FindBy(xpath = "//h2[text()=\"Shared data summary\"]")
    
    WebElement verifyshareddatasummary;
    
    @FindBy(xpath = "//div[@class='share__button']/a")
    
    WebElement shareddatadetailslink;
    
    @FindBy(xpath = "//div//span[text()=\"Usage view\"]")
    
    WebElement usageview;
    
    @FindBy(xpath = "//img[@class = \"site-header__header__logo__img\"]")
    
    WebElement teluslogo;
    
    @FindBy(xpath = "//span[text() =\"View heavy data user details\"]")
    
    WebElement heavydatadetails;
    
    @FindBy(xpath = "//div[@class=\"top__layer\"]/img")
    
    WebElement imagescroll;
    
    @FindBy(xpath = "//select[@id='choisir-un-compte' or @id='select-a-ban']")
    
    WebElement selectban;
    
    @FindBy(xpath = "")
    
    WebElement viewupgradeeligible;
    
    @FindBy(xpath ="//span[text()='Device view']")
    
    WebElement deviceview;
    
    @FindBy(xpath ="//span[text()='View overage details']")
    
    WebElement viewoverage;
    
    @FindBy(xpath ="//span[@class='users__count']")
    
    WebElement usercount;
    
    @FindBy(xpath ="//span[text()='View subscribers']")
    
    WebElement viewsubscriber;
    
    @FindBy(xpath ="//span[text()='Subscriber view']")
    
    WebElement subscriberview;
    
    @FindBys(value = { @FindBy(xpath = "/div[@c/lass='new__dynamic__table__column']")})
	public List<WebElement> tablebody;
    
    @FindBy(xpath ="//span[@class='entries__number']")
    
    WebElement entriesnumber;

    String manhattan = "Manhattan Project";
    
    String Shareddatasummary = "Shared data summary";

    String usageviewtext ="Usage view";
    
    String deviceviewtxt = "Device view";
    
    String Subscriberviewtxt = "Subscriber view";
	
	public void logindashbaord(String username, String password) throws InterruptedException
	{
		
		waitandclick(txtUsername);
		txtUsername.sendKeys(username);
		waitforelement(txtPassword);
		txtPassword.clear();
		waitandclick(txtPassword);
		txtPassword.sendKeys(password);
		waitandclick(btnEnter);
		waitandclick(dealercode);
		dealercode.sendKeys(dealercodeforagent);
		salesid.sendKeys(salescodeforagent);
		waitandclick(continuebutton);
		waitandclick(customername);
		customername.sendKeys(projectnameforagent);
		waitandclick(continuecontractbutton);
		waitforelement(Manhattanproject);
		verifycompletetext(Manhattanproject, manhattan);
	
	}
	
	public void verifydashbordlink() throws Exception
	{
		
		 waitforelement(verifyshareddatasummary);
		 verifycompletetext(verifyshareddatasummary, Shareddatasummary);
		 waitandclick(shareddatadetailslink);
		 waitforelement(usageview);
		 verifycompletetext(usageview, usageviewtext); 
		 waitandclick(teluslogo);
		 waitforelement(Manhattanproject); 
		 waitandclick(heavydatadetails);
		 waitforelement(usageview); 
		 verifycompletetext(usageview, usageviewtext);
		 waitandclick(teluslogo);
		 waitandclick(selectban);
		 selectvaluefromdropdown(selectban);
		 scrolldown();
		
		 waitforelement(viewupgradeeligible);
		 waitandclick(viewupgradeeligible);
		 waitandclick(deviceview); 
		 verifycompletetext(deviceview, deviceviewtxt);
		 waitandclick(teluslogo); scrolldown();
		 
		 
		 waitandclick(viewoverage);
		 verifycompletetext(usageview, usageviewtext);
		 waitandclick(teluslogo);
		 Thread.sleep(30000);
		 scrolldown();
		 String count = usercount.getText().trim();
		 waitandclick(viewsubscriber);
		 verifycompletetext(subscriberview, Subscriberviewtxt);
		 Thread.sleep(30000);
		 scrolldown();
		 String count1 = entriesnumber.getText().trim();
		 assertEquals(count, count1);
		 
		 
		 
		 
		 
		 
		
		
		
	}
	
	
	
	

}
