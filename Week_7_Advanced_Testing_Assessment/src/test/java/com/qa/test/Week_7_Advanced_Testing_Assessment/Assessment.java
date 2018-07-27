package com.qa.test.Week_7_Advanced_Testing_Assessment;

import cucumber.api.java.Before; 
import cucumber.api.java.After; 

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports; 
import com.relevantcodes.extentreports.ExtentTest; 
import com.relevantcodes.extentreports.LogStatus; 

import static org.junit.Assert.assertEquals;

public class Assessment {

	RequestSpecification request;
	Response response;
	ValidatableResponse json;

	
	ChromeDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@Before
	public void setup() {


		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		
		extent = new ExtentReports("C:/Users/Admin/Documents/Reports.html", true); 
		test = extent.startTest("verify get user functionality");

		driver.get("http://10.0.10.10:9966/petclinic/swagger-ui.html#/");
		
		driver = new ChromeDriver();

	}
	

	@After
	public void teardown() {
		
	}
	

// Scenario: get owners
		
	@Given("^an owner$")
	public void an_owner() {

		request = given().contentType(ContentType.JSON);
		
		test.log(LogStatus.PASS, "request initiated successfully");

	}

	@When("^a user gets the owner from the system$")
	public void a_user_gets_the_owner_from_the_system() {

		response = request.when().get("http://10.0.10.10:9966/petclinic/swagger-ui.html#/getOwners");
	
		test.log(LogStatus.PASS, "get user successful");
		
	}

	@Then("^the status code reads 200$")
	public void the_status_code_reads(int statusCode) {

		json = response.then().statusCode(200);

		test.log(LogStatus.PASS, "status code correct"); 

	}
		
// Scenario: add owners

	@Given("^an owner$")
	public void an_owner() {
	
		request = given().contentType(ContentType.JSON);
		
		test.log(LogStatus.PASS, "request initiated successfully");

	}

	@When("^a user adds the owner to the system$")
	public void a_user_adds_the_owner_to_the_system() {

		response = request.when().get("http://10.0.10.10:9966/petclinic/swagger-ui.html#/addOwners");
	
		test.log(LogStatus.PASS, "get user successful");
		
	}

	@Then("^the status code reads 201$")
	public void the_status_code_reads(int statusCode) {

		json = response.then().statusCode(201);

		test.log(LogStatus.PASS, "status code correct"); 


	}	
	
// Scenario: get owners list

	@Given("^an owner$")
	public void an_owner() {
	
		request = given().contentType(ContentType.JSON);
		
		test.log(LogStatus.PASS, "request initiated successfully");

	}

	@When("^a user gets the owner list from the system$")
	public void a_user_gets_the_owner_list_from_the_system() {

		response = request.when().get("http://10.0.10.10:9966/petclinic/swagger-ui.html#/getOwnerList");
	
		test.log(LogStatus.PASS, "get user successful");
		
	}

	@Then("^the status code reads 200$")
	public void the_status_code_reads(int statusCode) {

		json = response.then().statusCode(200);

		test.log(LogStatus.PASS, "status code correct"); 


	}	
	
// Scenario: delete owner

	
	@Given("^an owner$")
	public void an_owner() {
	
		request = given().contentType(ContentType.JSON);
		
		test.log(LogStatus.PASS, "request initiated successfully");

	}

	@When("^a user deletes the owner from the system$")
	public void a_user_deletes_the_owner_from_the_system() {

		response = request.when().get("http://10.0.10.10:9966/petclinic/swagger-ui.html#/deleteOwner");
	
		test.log(LogStatus.PASS, "get user successful");
		
	}

	@Then("^the status code reads 200$")
	public void the_status_code_reads(int statusCode) {

		json = response.then().statusCode(200);

		test.log(LogStatus.PASS, "status code correct"); 


	}
	
	
// Scenario: update owner	


	@Given("^an owner$")
	public void an_owner() {
	
		request = given().contentType(ContentType.JSON);
		
		test.log(LogStatus.PASS, "request initiated successfully");

	}

	@When("^a user updates the owner from the system$")
	public void a_user_updates_the_owner_from_the_system() {

		response = request.when().get("http://10.0.10.10:9966/petclinic/swagger-ui.html#/updateOwner");
	
		test.log(LogStatus.PASS, "get user successful");
		
	}

	@Then("^the status code reads 200$")
	public void the_status_code_reads(int statusCode) {

		json = response.then().statusCode(200);

		test.log(LogStatus.PASS, "status code correct"); 


	}
	
	//post, put, get, delete
	
	
	extent.endTest(test); 
	extent.flush();
	
}