package com.CommonUtils;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Basesuite.BaseClass;

public class ActionUtils extends BaseClass{
	
	
	public WebElement waitForElement(WebElement ele) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)) ;
		 WebElement element=wait.until(ExpectedConditions.visibilityOf(ele));
		return element;
	}
	public void scrollToElement(WebElement element) {
         WebElement ele = waitForElement(element);
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
	public void clearText(WebElement element) {
		String existingValue = element.getAttribute("value");
		for(int i=1;i<=existingValue.length();i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
	}
	public String getAttribute(WebElement element) {
			return element.getAttribute("value");
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}

}
