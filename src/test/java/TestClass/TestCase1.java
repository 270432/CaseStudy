package TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.BaseClass.TestBase;
import Com.Test_Class.TestClass1;

public class TestCase1 extends TestBase {
	TestClass1 TS;
	
	public TestCase1() {
		super();
	}
	@BeforeMethod
	public  void setup() throws InterruptedException, IOException {
		initialization();
		TS=new TestClass1();
		TS.searchText();
		Thread.sleep(2000);
		TS.ClickWan();
		Thread.sleep(4000);
		getScreenShotPath();
		Thread.sleep(4000);
	}
	@Test(priority=1)
	public void VerifyTest() {
		TS.VerifyStd();
		
	}
	@Test(priority=2)
	public void Title() {
		String title=TS.VerifyTitle();
		Assert.assertEquals(title, "Wankhede Stadium - Google Maps");
		System.out.println("VerifyTitle Is"+" : "+title);
		System.out.println(title);
		
	}
	@Test(priority=3)
	public void ratingPoint() {
		String Rating=TS.Verifyrating();
		System.out.println("Rating Point Is"+" :"+Rating);
		}
	@Test(priority=4)
	public void reviewPrint() {
		String review=TS.PrintReview();
		System.out.println("Review Rating Is"+" : "+review);
	}
	@Test(priority=5)
	public void VerifyLink() {
		String Linktext=TS.Link();
		Assert.assertTrue(true);
   	 System.out.println("Present Link Is"+" :"+Linktext);
		
   	 //Print Address
   	String Addtext=TS.PrintAddress();
   	System.out.println("Address Is"+" :"+Addtext);
		}
	@Test(priority=6)
	public void VerifyNumber() throws IOException, InterruptedException {
		String Num=TS.PhoneNumber();
		Assert.assertEquals(Num, "022 2279 5500");
		System.out.println("Present Phone No Is"+" :"+Num);
		Thread.sleep(4000);
		getScreenShotPath();
		Thread.sleep(4000);
		}
	/*@Test
	public void TakeScreenshot() throws Exception
	{
		getScreenShotPath();	
	}*/
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
   
}
