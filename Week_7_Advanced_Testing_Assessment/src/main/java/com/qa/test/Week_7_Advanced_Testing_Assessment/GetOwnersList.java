package com.qa.test.Week_7_Advanced_Testing_Assessment;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

//http://10.0.10.10:9966/petclinic/swagger-ui.html#/

public class GetOwnersList {

		@FindBy (xpath = "//*[@id=\"owner-rest-controller_deleteOwnerUsingDELETE\"]/div[1]/ul/li/a/span/p")
		private WebElement clickDeleteOwner;		
				
		public void home () {
						
			clickDeleteOwner.click();

		}
	
}
