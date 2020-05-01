package Managefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Commonpage.Testbase;

public class ManageAllViews extends Testbase {

	public ManageAllViews(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//span[text()='Manage']/parent::span/parent::a")
	
	WebElement Managelink;
	
	@FindBy(xpath = "//span[text()='Subscriber view']/parent::span/parent::span/parent::a")
	
	WebElement Subscriberviewlink;
    
    @FindBy(xpath ="//span[text()='Device view']/parent::span/parent::span/parent::a]")
	
	WebElement Deviceviewlink;
  
    @FindBy(xpath ="//span[text()='Usage view']/parent::span/parent::span/parent::a]")
	
	WebElement Usageviewlink;
    
    @FindBy(xpath = "//div//span[text()='Usage view']")
    
    WebElement usageview;
    
    @FindBy(xpath ="//span[text()='Device view']")
    
    WebElement deviceview;
    
    @FindBy(xpath ="//span[text()='Subscriber view']")
    
    WebElement subscriberview;
    
    @FindBy(xpath = "//img[@class = \"site-header__header__logo__img\"]")
    
    WebElement teluslogo;
    
    String usageviewtext ="Usage view";
    
    String deviceviewtxt = "Device view";
    
    String Subscriberviewtxt = "Subscriber view";
	
	
	
	
	
	public void Subscriberview()
	{
		waitandclick(Managelink);
		waitandclick(subscriberview);
		waitforelement(subscriberview);
		verifycompletetext(subscriberview, Subscriberviewtxt);
		waitandclick(teluslogo);
		
	}
	
	public void deviceview()
	{
		waitandclick(Managelink);
		waitandclick(deviceview);
		waitforelement(deviceview);
		verifycompletetext(deviceview, deviceviewtxt);
		waitandclick(teluslogo);
	}
	
	public void usageview()
	{
		waitandclick(Managelink);
		waitandclick(usageview);
		waitforelement(usageview);
		verifycompletetext(usageview, usageviewtext);
		waitandclick(teluslogo);
	}
	
	
	
	

}
