package DocuTrackerPac;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PBPredefined {


	//public static void CreatPBPredefinedReport() {}
	
	static String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net/";
	static WebDriver driver=new FirefoxDriver();
	public void RepeatCode() throws Exception
	{
		//==================Reports====================================
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();
		System.out.println(" Clicking On Reports");
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/a")).click();
		System.out.println(" Clicking On Predefined Reports");
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/ul/li[2]/a")).click();
		System.out.println("Selecting PB");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
		System.out.println(" Clicking On Alpha");
		Thread.sleep(3000);
		System.out.println("Selecting Predefined Reports");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_dllpredefined']"))).selectByVisibleText("All PB Predefined Reports");
		Thread.sleep(5000);
		
	}
	public void genPbAgree() throws Exception
	{
		System.out.println("Selecting General PB Agreement Information");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridSavedReports_linkbutton_0']")).click();
		Thread.sleep(10000);
		System.out.println("Selecting Agreements");
		//Select AgreementStyle
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementStyle']"))).selectByVisibleText("All types");
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		Thread.sleep(4000);
	}
	
	public void scopealllock() throws Exception{
	System.out.println("Scope Of Lockup(All Provisions)");
	driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridSavedReports_linkbutton_17']")).click();
	Thread.sleep(10000);
	System.out.println("Selecting Agreements");
	//Select AgreementStyle
	new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementStyle']"))).selectByVisibleText("All types");
	Thread.sleep(4000);
	new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("All Client Entities");
	Thread.sleep(4000);
	}
	

	
	public static void createPbPredefined() throws Exception {
		
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get(url);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("keerthyadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
		Thread.sleep(8000);
		
		//==================Reports====================================
		PBPredefined prdrep=new PBPredefined();
		prdrep.RepeatCode();
		
		
		
		//===========================General PB Agreement Information==========================================
		PBPredefined pbagree=new PBPredefined();
		pbagree.genPbAgree();
		//=======================ID's Include==================================================
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
		System.out.println("IDS are Included");
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the Excel Report Button General PB Agreement");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report Button Clicked General PB Agreement");
		Thread.sleep(15000);
		
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(4000);
		Robot rbt1=new Robot();
		rbt1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);			
		
		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
	  	Thread.sleep(8000);
	  	
	  	PBPredefined prdrep1=new PBPredefined();
		prdrep1.RepeatCode();
			
		//===========================General PB Agreement Information==========================================
		PBPredefined pbagree1=new PBPredefined();
		pbagree1.genPbAgree();
		//======================IDS Do Not Include=========================
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
		System.out.println("IDS are not Included");
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the General PB Agreement IDS Do Not  Excel Report Button");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report General PB Agreement IDS Do Not  Button Clicked");
		Thread.sleep(15000);
		

		Robot rbt2=new Robot();
		rbt2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
//==========================================================================================================		
		
		
		
		//===========================Scope Of Lockup(All Provisions)==========================================
		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
	  	Thread.sleep(8000);
	  	
		PredefinedRep prdrep2=new PredefinedRep();
		prdrep2.RepeatCode();
	  	
		PBPredefined scope=new PBPredefined();
	  	scope.scopealllock();
		//=======================ID's Include==================================================
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
		System.out.println("IDS are Included");
				
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
				
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked Scope Of Lockup");
		Thread.sleep(15000);
			
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the Excel Report Button");
		Thread.sleep(60000);
				
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report Button Scope Of Lockup Clicked");
		Thread.sleep(15000);
						
		
		Robot rbt3=new Robot();
		rbt3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
				
		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
	  	Thread.sleep(8000);	
	  	
		PredefinedRep prdrep3=new PredefinedRep();
		prdrep3.RepeatCode();
			
		
		//============================Scope Of Lockup========================================
		PBPredefined scope1=new PBPredefined();
	  	scope1.scopealllock();
		//=======================ID's Do Not Include==================================================
				
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
		System.out.println("IDS are Included");
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked Scope Of Lockup ID's Do Not");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the Excel Report Button Scope Of Lockup ID's Do Not");
		Thread.sleep(25000);
		
		
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report Button Clicked");
		Thread.sleep(15000);
		
		Robot rbt4=new Robot();
		rbt4.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		
	}
}

