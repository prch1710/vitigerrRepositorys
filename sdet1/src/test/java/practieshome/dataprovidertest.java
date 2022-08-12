package practieshome;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidertest {
	@Test(dataProvider="dataprovider")
	public void booktikect(String src,String dest)
	{
		System.out.println("book from "+src+ "to "+dest+"");
	}
	
	

	
	@DataProvider
	public Object[][] dataprovider()
	{
		Object[][] objrr=new Object[3][2];

		objrr[0][0]="banglore";
		objrr[0][1]="goa";
		
		objrr[1][0]="banglore";
		objrr[1][1]="goa";
		
		objrr[2][0]="banglore";
		objrr[2][1]="goa";
		
		objrr[3][0]="banglore";
		objrr[3][1]="goa";
		
		return objrr;
		
		
		
	}
}
