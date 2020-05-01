package Managetest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commonpage.DrivetestCase;
import Commonpage.ExtentTestManager;

public class MACDactionscript extends DrivetestCase {
	
	@Test
	
	public void MACDaction() throws InterruptedException
	{
		
		managedashboard.logindashbaord(username, password);
		ExtentTestManager.getTest().log(Status.INFO, "Login successfully");
		manageallviews.Subscriberview();
		ExtentTestManager.getTest().log(Status.INFO, "subscriberview");
		manageallviews.deviceview();
		manageallviews.usageview();
		ExtentTestManager.getTest().log(Status.INFO, "Usage view");
	}

}
