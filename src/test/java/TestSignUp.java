public class TestSignUp {
	
	private Account account;
	private SignUpPage signUpPage;
	public static WebDriver driver;
	
	@Before
	public void setUp(){
		// Instantiate page objects here
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_MyPractise\\TestKeval\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.get("https://venngage.com/templates/featured");
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		
		IndividualTemplatesPage obj = new IndividualTemplatesPage();
		obj.clickOnSignUpButton();
		
		SignUpPage data = new SignUpPage();
		data.signupbuttonclick();
		
		firstname.sendKeys(firstname);
		lastname.sendKeys(lastname);
		email.sendKeys(email);
		password.sendKeys(password);
		signup.click();					
	}
}

