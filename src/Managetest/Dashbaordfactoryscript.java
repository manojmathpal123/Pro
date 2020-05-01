package Managetest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Commonpage.DrivetestCase;
import Commonpage.ExtentTestManager;


public class Dashbaordfactoryscript extends DrivetestCase{
	
	@Test
	
	public void verifydashbaordlink() throws Exception
	{
		managedashboard.logindashbaord(username, password);
		ExtentTestManager.getTest().log(Status.INFO, "Login successfully");
		managedashboard.verifydashbordlink();
		ExtentTestManager.getTest().log(Status.INFO, "Usage view link verify");
		
	}
}
