package org.objectrepository;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPojo extends BaseClass {

	public RegistrationPojo() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccnt;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//h1[text()='Register Account']")
	private WebElement regAcntSuccessMsg;	

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lstName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telePhn;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement pwd;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement cnfrmPwd;
	
	@FindBy(xpath = "//input[@name='newsletter']")
	private List <WebElement> nwsLtr; 

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chkBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement sbmt; 

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	 private WebElement accntCreated;
	 
	@FindBy (xpath = "//a[@class='btn btn-primary']")
	 private WebElement cntue;
			
	@FindBy (xpath = "//div[@class='alert alert-danger alert-dismissible']//child::i")
	 private WebElement warningnMsg;
	
	@FindBy (xpath ="//div[text()='E-Mail Address does not appear to be valid!']")
	 private WebElement invlidEmail;
	
	@FindBy (xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
	 private WebElement invalidTelePhn;
	
	@FindBy (xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
	 private WebElement enterFirstName;
	
	@FindBy (xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
	 private WebElement enterLastName;
	
	@FindBy (xpath = "//div[text()='Password must be between 4 and 20 characters!']")
	 private WebElement enterPswd;
	
	@FindBy (xpath = "//div[text()='Password confirmation does not match password!']")
	 private WebElement pswdMisMatch;

	public WebElement getMyAccnt() {
		return myAccnt;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getRegAcntSuccessMsg() {
		return regAcntSuccessMsg;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLstName() {
		return lstName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTelePhn() {
		return telePhn;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getCnfrmPwd() {
		return cnfrmPwd;
	}

	public List<WebElement> getNwsLtr() {
		return nwsLtr;
	}

	public WebElement getChkBox() {
		return chkBox;
	}

	public WebElement getSbmt() {
		return sbmt;
	}

	public WebElement getAccntCreated() {
		return accntCreated;
	}

	public WebElement getCntue() {
		return cntue;
	}

	public WebElement getWarningnMsg() {
		return warningnMsg;
	}

	public WebElement getInvlidEmail() {
		return invlidEmail;
	}

	public WebElement getInvalidTelePhn() {
		return invalidTelePhn;
	}

	public WebElement getEnterFirstName() {
		return enterFirstName;
	}

	public WebElement getEnterLastName() {
		return enterLastName;
	}

	public WebElement getEnterPswd() {
		return enterPswd;
	}

	public WebElement getPswdMisMatch() {
		return pswdMisMatch;
	}
	
	

	


}
