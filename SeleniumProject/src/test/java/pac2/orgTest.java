package pac2;

import org.testng.annotations.Test;

public class orgTest {
	
	@Test
	public void createOrgTest() {
		
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		String BROWSER = System.getProperty("browser");
		
		System.out.println("execute createOrgTest");
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
	}
	
	@Test
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}

}
