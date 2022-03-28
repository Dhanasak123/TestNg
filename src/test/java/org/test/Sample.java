package org.test;

import java.io.IOException;

import java.util.Date;

import org.base.BaseClass;
import org.pojo.PojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample extends BaseClass {

	@BeforeClass
	public void browserLaunch() {
		launchBrowser();
		toMaximize();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}

	@BeforeMethod
	public void StartTime() {
		passUrl("https://www.facebook.com/");
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(dataProvider="sampledata")
	public void tc1(String user, String pass) {
		PojoClass p = new PojoClass();
		toInput(p.getTxtuser(), user);
		toInput(p.getTxtpass(), pass);
	}

	@DataProvider(name="sampledata")
	private String[][] data() throws IOException {
      return new String[][] {
    	  {excelRead(0,0),excelRead(0, 1)},
    	  {excelRead(1, 0), excelRead(1, 1)}
      
	
      };
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
