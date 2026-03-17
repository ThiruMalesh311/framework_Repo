package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContactTest() {
		System.out.println(" execute createContactTest");
		
	String	URL= System.getProperty("url","http://localhost/8888");
	String	BROWSER = System.getProperty("browser","chrome");//if browser from flib or Cmd line not working it will open in default data passed
	String PASSWORD = System.getProperty("password");
	String USERNAME = System.getProperty("username");
	
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute ModifyContactTest");
	}

}
