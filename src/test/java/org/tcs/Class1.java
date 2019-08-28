package org.tcs;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Class1 {
	static WebDriver driver;
	@Given("user should launch browser")
	public void user_should_launch_browser() {
		System.setProperty("webdriver.chrome.driver","H:\\Arul\\SelCucumber\\Driver\\chromedriver.exe");
	      driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click add customer link")
	public void user_click_add_customer_link() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();    
	}
	/*@When("user will provide vaild details")
	public void user_will_provide_vaild_details() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.id("fname")).sendKeys("vishal");
		driver.findElement(By.id("lname")).sendKeys("Raj");
		driver.findElement(By.id("email")).sendKeys("raj@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9865182316");
		driver.findElement(By.xpath("//input[@name='submit']")).click();  
	}*/
/*	@When("user will provide vaild details{string},{string},{string},{string},{string}")
	public void user_will_provide_vaild_details(String fname, String lname, String email, String address, String phone) {	driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.xpath("//label[text()='Done']")).click(); 
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath(""//textarea[@name='addr']")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
*/	
/*	@When("user will provide valid details")
	public void user_will_provide_valid_details(io.cucumber.datatable.DataTable dataTable) {
		List <String> oned= dataTable.asList(String.class);
		System.out.println("one dimensional List");
		driver.findElement(By.xpath("//label[text()='Done']"));
		driver.findElement(By.id("fname")).sendKeys(oned.get(0));
		driver.findElement(By.id("lname")).sendKeys(oned.get(1));
		driver.findElement(By.id("email")).sendKeys(oned.get(2));
		driver.findElement(By.id("address")).sendKeys(oned.get(3));
		driver.findElement(By.id("phno")).sendKeys(oned.get(4));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		}*/
	
	@When("user will provide valid details")
	public void user_will_provide_valid_details(io.cucumber.datatable.DataTable dataTable) {
	 Map <String,String> asMap = dataTable.asMap(String.class, String.class);
	 driver.findElement(By.xpath("//label[text()='Done']")).click(); 
		driver.findElement(By.id("fname")).sendKeys("fname");
		driver.findElement(By.id("lname")).sendKeys("lname");
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("address");
		driver.findElement(By.id("telephoneno")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	 }
	@Then("to verified the customer id is displayed")
	public void to_verified_the_customer_id_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}
	}