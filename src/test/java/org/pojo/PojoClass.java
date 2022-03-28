package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	
   public PojoClass() {
	   PageFactory.initElements(driver, this);
}
   @FindBy (id="email")
	private WebElement txtuser;
	
	@FindBy (id="pass")
	private WebElement txtpass;

	@FindBy (name="login")
	private WebElement clcbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getClcbtn() {
		return clcbtn;
	}
	
	
	
	
	
	
	
}
