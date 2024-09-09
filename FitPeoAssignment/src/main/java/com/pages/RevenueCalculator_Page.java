package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Basesuite.BaseClass;
import com.CommonUtils.ActionUtils;

public class RevenueCalculator_Page extends ActionUtils{
	WebDriver driver = BaseClass.driver ;
	
	public RevenueCalculator_Page(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Revenue Calculator']")
	public WebElement revunueCalculator ; 
	@FindBy(xpath = "//h4[text()='Medicare Eligible Patients']")
	public WebElement text ; 
	@FindBy(xpath = "//span[contains(@class,'MuiSlider-thumb')]/input")
	public WebElement statusBar ; 
	@FindBy(xpath = "//input[contains(@class,'MuiInputBase')]")
	public WebElement textBox ; 
	@FindBy(xpath = "//p[text()='Total Recurring Reimbursement for all Patients Per Month']/following-sibling::p")
	public WebElement total_Recurring_Reimbursement ; 
	@FindBy(xpath = "//p[text()='Total Recurring Reimbursement for all Patients Per Month:']/p")
	public WebElement header_Recurring_Reimbursement ; 
	
	public void clickOnRevenueCalculator() {	 
		WebElement ele= waitForElement(revunueCalculator);
		ele.click();
	}
	public void clickOnCheckBox(String checkBoxCode) {
		
	WebElement checkBox=driver.findElement(By.xpath("//p[text()='"+checkBoxCode+"']/parent::div//input"));
	checkBox.click();
	
	}
	public void enterTextInTextBox(String string) {
		textBox.sendKeys(string);
	}


}
