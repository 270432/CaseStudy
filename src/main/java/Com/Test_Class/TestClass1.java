package Com.Test_Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseClass.TestBase;

public class TestClass1 extends TestBase{
	public TestClass1(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Stext;
	 

	@FindBy(xpath="(//div[@class='DgCNMb'])[1]")
	WebElement WanStdClick;
	
	@FindBy(xpath="(//span[contains(text(),'Wankhede Stadium')])[1]")
	WebElement VeriyfyStd;
	
	@FindBy(xpath="(//span[contains(text(),'4.5')])[1]")
	WebElement ratingpoint;
	
	@FindBy(xpath="//button[@class='HHrUdb fontTitleSmall rqjGif']")
	WebElement reviewsnumber;
	
	@FindBy(xpath="(//div[@class='Io6YTe fontBodyMedium'])[2]")
	WebElement link;
	
	@FindBy(xpath="(//div[@class='Io6YTe fontBodyMedium'])[1]")
	WebElement Address;
	
	@FindBy(xpath="(//div[@class='AeaXub'])[3]")
	WebElement PhoneNum;
	
	public void searchText() 
	{
		Stext.sendKeys("Wankhede Stedium");	
	}
    public void ClickWan() {
    	WanStdClick.click();
    }
    public void VerifyStd() {
    	String ExpResult="Stadium";
    	String ActualRes=VeriyfyStd.getText();
    	if(ExpResult.equals(ActualRes)) 
    	System.out.println("Stadium Text Is Present"+ ":"+ExpResult);
    	else
    		System.out.println("Stadium Text Is Not Present");
    	
    	}
    public String VerifyTitle() {
    	return driver.getTitle();
 
    }
   
    public String Verifyrating() {
    	return ratingpoint.getText();
    	}
    public String PrintReview() {
    	return reviewsnumber.getText();
    }
    public String Link() {
    	return link.getText();
    	 
         }
   public String PrintAddress() {
	  return Address.getText();
   }
   public String PhoneNumber() {
	return PhoneNum.getText();
   }
   
}
