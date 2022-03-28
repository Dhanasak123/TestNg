package org.amazon;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Amazon extends BaseClass{
	
	public Amazon() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(xpath="//input[@id='twotabsearchtextbox']")})
	private WebElement search;


	public WebElement getSearch() {
		return search;
	}
	
}