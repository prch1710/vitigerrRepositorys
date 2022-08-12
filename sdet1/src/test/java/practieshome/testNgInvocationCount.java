package practieshome;

import org.testng.annotations.Test;

public class testNgInvocationCount {
	@Test
	public void createContact() 
	{
		System.out.println("create contact");
	}
	@Test(invocationCount=2)
	public void modifyContact() 
	{
		System.out.println("modify contact");
	}
	@Test
	public void deletContact() 
	{
		System.out.println("delet contact");
	}

}
