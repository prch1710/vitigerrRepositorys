package practieshome;

import org.testng.annotations.Test;

public class testNgDependsonMethos {
	@Test
	public void createContact() 
	{
		System.out.println("create contact");
		int[] arr= {1,2,3,4};
		System.out.println(arr[4]);//
	}
	@Test(dependsOnMethods="createContact")
	public void modifyContact() 
	{
		System.out.println("modify contact");
	}
	@Test(dependsOnMethods="createContact")
	public void deletContact() 
	{
		System.out.println("delet contact");
	}

}
