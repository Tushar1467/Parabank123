package TestCases;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagesClass.Registration;



public class Register {
	
	WebDriver driver;

	@BeforeClass
	void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=false");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();	
	}

	@Test
	void testLogin() {
		
		Registration pb =new Registration(driver);

	pb.RegisterTag();
	pb.FirstName("Tushar");
	pb.LastName("Sharma");
	pb.AddressSteet("114");
	pb.AddressCity("Chandigarh");
	pb.AddressState("Chandigarh");
	pb.ZipCode("112233");
	pb.PhoneNumber("9991004312");
	pb.SSNCode("112233");
	pb.UserName("Tushar123");
	pb.Password("user123");
	pb.RepeatPasword("user123");
	pb.Register();
	}
					
	@AfterClass
	void teardown() {
		driver.close();
	}



}