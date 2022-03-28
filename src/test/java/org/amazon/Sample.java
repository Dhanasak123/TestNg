package org.amazon;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	public void startTime() {
		passUrl("https://www.amazon.com/");
	}

	@AfterMethod
	public void endTime() {

		System.out.println("DS");
	}

	@Test(dataProvider = "sampledata")
	public void tc1(String phone) throws InterruptedException, AWTException {

		Amazon a = new Amazon();
		toInput(a.getSearch(), phone);
		enterKey();
		Thread.sleep(6000);
		List<WebElement> phones = driver.findElements(By.className("a-price-whole"));
		System.out.println("Number of" + phone + "phones in my list" + phones.size());

	}

	@DataProvider(name = "sampledata")
	public String[][] data() throws IOException {
		return new String[][] { 
			{ excelRead(0, 0) }, { excelRead(2, 0) }, { excelRead(4, 0) }, { excelRead(6, 0) },
				{ excelRead(8, 0) }, { excelRead(10, 0) }, { excelRead(11, 0) }, { excelRead(13, 0) },

		};
	}

}