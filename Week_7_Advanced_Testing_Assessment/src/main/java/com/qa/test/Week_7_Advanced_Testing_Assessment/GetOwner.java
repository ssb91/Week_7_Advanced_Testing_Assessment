package com.qa.test.Week_7_Advanced_Testing_Assessment;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

//http://10.0.10.10:9966/petclinic/swagger-ui.html#/

public class GetOwner {

		
		@FindBy (xpath = "//*[@id=\"owner-rest-controller_updateOwnerUsingPUT\"]/div[1]/ul/li/a/span/p")
		private WebElement clickUpdateOwner;		
		
		public void home () {
						
			clickUpdateOwner.click();
			
		}
	
}
