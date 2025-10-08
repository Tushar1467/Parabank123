package PagesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	
WebDriver driver;

public Registration (WebDriver driver){
this.driver= driver;
}
//Locators
By tag_Register_a= By.xpath("//a[text()='Register']");
By txt_firstname_loc= By.xpath("//input[@id='customer.firstName']");
By txt_lastname_loc=By.xpath("//input[@id='customer.lastName']");
By txt_AddressStreet_loc= By.xpath("//input[@id='customer.address.street']");
By txt_AddressCity_loc=By.xpath("//input[@id='customer.address.city']");
By txt_AddState_loc=By.xpath("//input[@id='customer.address.state']");
By txt_ZipCode_loc=By.xpath("//input[@id='customer.address.zipCode']");
By txt_PhoneNum_loc=By.xpath("//input[@id='customer.phoneNumber']");
By txt_SSN_loc=By.xpath("//input[@id='customer.ssn']");
By txt_username_loc=By.xpath("//input[@id='customer.username']");
By txt_Password_loc=By.xpath("//input[@id='customer.password']");
By txt_RepeatPass_loc=By.xpath("//input[@id='repeatedPassword']");
By but_Register_loc=By.xpath("//input[@value='Register']");	


public void RegisterTag () {
	driver.findElement(tag_Register_a).click();
}
public void FirstName (String name) {
	driver.findElement(txt_firstname_loc).sendKeys(name);
}
public void LastName (String name) {
	driver.findElement(txt_lastname_loc).sendKeys(name);
}
public void AddressSteet (String st) {
	driver.findElement(txt_AddressStreet_loc).sendKeys(st);
}
public void AddressCity (String ct) {
	driver.findElement(txt_AddressCity_loc).sendKeys(ct);
}
public void AddressState (String state) {
	driver.findElement(txt_AddState_loc).sendKeys(state);
}
public void ZipCode (String code) {
	driver.findElement(txt_ZipCode_loc).sendKeys(code);
}
public void PhoneNumber (String num) {
	driver.findElement(txt_ZipCode_loc).sendKeys(num);
}
public void SSNCode (String ssn) {
	driver.findElement(txt_ZipCode_loc).sendKeys(ssn);
}
public void UserName (String username) {
	driver.findElement(txt_username_loc).sendKeys(username);
}
public void Password (String password) {
	driver.findElement(txt_Password_loc).sendKeys(password);
}
public void RepeatPasword (String password) {
	driver.findElement(txt_RepeatPass_loc).sendKeys(password);
}
public void Register () {
	driver.findElement(but_Register_loc).click();
}




}

