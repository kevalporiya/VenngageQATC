public class Account {
	
	/**
	* Create the constructor that takes the following:
	* First name
	* Last name
	* Email
	* Password
	**/
	
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	
	public Account(String FirstName , String LastName , String Email , String Password)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Password= Password;	
	}	
	// Create the necessary Getter functions
	
	public String  getFirstName()
	{
        return this.FirstName;
    	}
   	 public void setFirstName(String firstname) {
       	 this.FirstName = firstname;
   	 }
	
	public String  getLastName()
	{
        return this.LastName;
    	}
   	 public void setLastName(String lastname) {
       	 this.LastName = lastname;
   	 }
	
	public String  getEmail()
	{
        return this.Email;
    	}
   	 public void setEmail(String email) {
       	 this.Email = email;
   	 }
	
	public String  getPassword()
	{
        return this.Password;
    	}
   	 public void setPassword(String password) {
       	 this.Password = password;
   	 }
	
}
