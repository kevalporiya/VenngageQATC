public class TestSignUp {
	
	private Account account;
	private SignUpPage signUpPage;
	public static WebDriver driver;
	
	@Before
	public void setUp(){
		// Instantiate page objects here
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_MyPractise\\TestFirmexKeval\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.get("https://venngage.com/templates/layouts");
		
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		
		Actions a = new Actions(driver);
		a.moveto
		
		driver.findElement(By.id("user_first_name")).sendKeys("QA");
		driver.findElement(By.id("user_last_name")).sendKeys("Test");
		driver.findElement(By.id("user_email")).sendKeys("qa.123@venngage.com");
		driver.findElement(By.id("user_password")).sendKeys("123456");
		driver.findElement(By.id("btn_register")).click();
		
		
		
	}
}

