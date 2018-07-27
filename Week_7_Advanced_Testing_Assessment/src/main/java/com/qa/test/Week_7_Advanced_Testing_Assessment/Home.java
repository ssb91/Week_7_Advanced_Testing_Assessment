package com.qa.test.Week_7_Advanced_Testing_Assessment;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

//http://10.0.10.10:9966/petclinic/swagger-ui.html#/

public class Home {

		@FindBy (xpath = "//*[@id=\"resource_owner-rest-controller\"]/div/h2/a")
		private WebElement clickOwnerRestController;
			
		public void home () {
						
			clickOwnerRestController.click();
			
		}
	
}
