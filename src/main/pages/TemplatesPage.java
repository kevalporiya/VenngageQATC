public class IndividualTemplatesPage extends TestSignUp {
	
	setUp();
	// Add XPaths here
	
	WebElement signUp = driver.findElement(By.xpath("//div[@id='featured']//div[@class='staticStyles__templatesContainer--2dQJ3']//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//center[1]//div[1]//a[1]//button[1]"))
	
	// Create a function that clicks on the Sign Up button
	
	public void clickOnSignUpButton()
	{
		Actions builder = new Actions(driver);
		Action mouseOverSignUpButton = builder.moveToElement(signUp).click().build().perform();
                       
                      
	}
}
