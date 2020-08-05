public class SignUpPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	WebElement firstname = driver.findElement(By.id("user_first_name"));
	WebElement lastname =  driver.findElement(By.id("user_last_name"));
	WebElement email = driver.findElement(By.id("user_email"));
	WebElement password = driver.findElement(By.id("user_password"));
	WebElement signup = driver.findElement(By.xpath("//button[@id='btn_register']"));
	
	public SignUpPage(){
		this.selenium = Selenium();
	}
	
	// Create a function that takes an Account and simulates signing up using Selenium actions. (Refer to Selenium.java)
	
	public void signupbuttonclick()
	{
	
		Account ac = new Account(String FirstName , String LastName , String Email , String Password);
		
		ac.setFirstName("QA");
		String firstname = ac.getFirstName();
		
		ac.setLastName("Test");
		String lastname = ac.getLastName();
		
		ac.setEmail("qa.678@venngage.com");
		String email = ac.getEmail();
		
		ac.setPassword("123456 ");
		String password = ac.getPassword();
	}
	
}
