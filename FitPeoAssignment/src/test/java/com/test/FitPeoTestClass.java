package com.test;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Basesuite.BaseClass;
import com.CommonUtils.ActionUtils;
import com.pages.RevenueCalculator_Page;

public class FitPeoTestClass extends BaseClass{

	
	@Test
	public void testing_RevenueCalculator() throws InterruptedException {
		RevenueCalculator_Page page = new RevenueCalculator_Page();
		ActionUtils utils = new ActionUtils() ;
		
		try {
		page.clickOnRevenueCalculator();

		utils.scrollToElement(page.text);
		
		
		int width = (int) (page.statusBar.getSize().width*4+ 14) ;
		Actions ac = new Actions (driver);
		ac.dragAndDropBy(page.statusBar, width, 0).build().perform();
		page.scrollToElement(page.text);

		utils.clearText(page.textBox);
		
		String ExpectedTextBoxValue ="560";
		page.enterTextInTextBox(ExpectedTextBoxValue);
		
		String ActualTextBoxValue=utils.getAttribute(page.textBox);
		
		Assert.assertEquals(ActualTextBoxValue, ExpectedTextBoxValue);
		
		utils.clearText(page.textBox);
//		Entering value 820 in order get  $110700. value
		page.enterTextInTextBox("820");
		page.clickOnCheckBox("CPT-99091");
		page.clickOnCheckBox("CPT-99453");
		page.clickOnCheckBox("CPT-99454");
		page.clickOnCheckBox("CPT-99474");

		
		String  Total_Recurring_Reimbursement= page.getText(page.total_Recurring_Reimbursement);
		String Header_Recurring_Reimbursement  = page.getText(page.header_Recurring_Reimbursement);
		
		Assert.assertEquals(Total_Recurring_Reimbursement, Header_Recurring_Reimbursement);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	}
	

}
