package DocuTrackerPac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomReport {
	
	

	public static void ISDACustomReportTset() throws InterruptedException, AWTException {
		
			
			System.out.println("ISDACustomReportTset");
			WebDriver driver = StaticClass.driver;
	       Helper.loginapp(driver);			
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();//report
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/a")).click();//custom
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();//generate
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(@href,'steponereportsignalRNew.aspx?CID=10')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkExec_0']")).click();
			new Select(driver.findElement(By.xpath(".//*[@id='ddlClientEntities']"))).selectByVisibleText("All Client Entities");
			driver.findElement(By.xpath(".//*[@id='LoadingTree']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/div/div/div/span[1]/span")).click();
			driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/ul/li[3]/div/div/div/div/span[2]/label/span[1]")).click();
			driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
			Thread.sleep(10000);
			
			    System.out.println("Agreement Successfully added");
			

			
			
			driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
			for(int i=0;i<15;i++)
		    {
		             driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		    }
			Random randomGenerator = new Random();
			  boolean i = true;
			  while(i)
			  {
			   int r = randomGenerator.nextInt(1000);
			   System.out.println("Generated : " + r);
			   
			   i=false;  
			  Thread.sleep(4000);
			driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys(r+"abcd");
			driver.findElement(By.xpath(".//*[@id='Submit']")).click();
			
			Thread.sleep(20000);
			driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
			Thread.sleep(20000);
			
			driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
			Thread.sleep(10000);
			
			
			Robot rbt=new Robot();
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rbt.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='rhome']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='navbar-container']/div[2]/ul/li/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='../Logout.aspx']")).click();
			Thread.sleep(1000);
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='rhome']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='navbar-container']/div[2]/ul/li/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='../Logout.aspx']")).click();
			Thread.sleep(1000);
			driver.close();
			  }
		
		}

	public static void PBCustomReportTset() throws InterruptedException, AWTException {
		System.out.println("PBCustomReportTset");
		WebDriver driver = StaticClass.driver;
	       Helper.loginapp(driver);		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();//report
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/a")).click();//custom 
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();//generate
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'steponereportsignalRNew.aspx?CID=10')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkExec_1']")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		driver.findElement(By.xpath(".//*[@id='LoadingTree']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/div/div/div/span[1]/span")).click();
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/ul/li[3]/div/div/div/div/span[2]/label/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
		Thread.sleep(10000);
		
		    System.out.println("Agreement Successfully added");
		
		
		driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
		for(int i=0;i<15;i++)
	    {
	             driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	    }
		Random randomGenerator = new Random();
		  boolean i = true;
		  while(i)
		  {
		   int r1 = randomGenerator.nextInt(1000);
		   System.out.println("Generated : " + r1);
		   
		   i=false;  
		  Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys("report"+r1);
		driver.findElement(By.xpath(".//*[@id='Submit']")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
		Thread.sleep(10000);
		
		
		Robot rbt=new Robot();
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='navbar-container']/div[2]/ul/li/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='../Logout.aspx']")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='navbar-container']/div[2]/ul/li/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='../Logout.aspx']")).click();
		Thread.sleep(1000);
		driver.close();
		  }
	}
	///////////////////////////////
	public static void ISDADraftCustomReportTset() throws InterruptedException, AWTException {
		System.out.println("PBCustomReportTset");
		System.out.println("ISDADraftCustomReportTset");
		WebDriver driver = StaticClass.driver;
	       Helper.loginapp(driver);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();//report
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/a")).click();//custom 
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();//generate
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='steponereportsignalRNew.aspx?CID=3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkDraft_0']")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		driver.findElement(By.xpath(".//*[@id='LoadingTree']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/ul/li[1]/div/div/div/div/span[2]/label/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='Filter Questions']"));
		//driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
		for(int i=0;i<15;i++)
	    {
	             driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
	    }
		Random randomGenerator = new Random();
		  boolean i = true;
		  while(i)
		  {
		   int r2 = randomGenerator.nextInt(1000);
		   System.out.println("Generated : " + r2);
		   
		   i=false;  
		  Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys("Report"+r2);
		driver.findElement(By.xpath(".//*[@id='Submit']")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
		Thread.sleep(5000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		Robot rbt1=new Robot();
		rbt1.keyPress(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("//a[@onclick='RatingPDF();']"));
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//a[@id='download62PDF1' and @onclick='RatingPDF();']")).click();
		Thread.sleep(2000);
		Robot rbt2=new Robot();
		rbt2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);				
		
		driver.findElement(By.xpath("//a[@id='download63PDF1' and @onclick='CdsPDF();' ]")).click();
		Thread.sleep(2000);
		Robot rbt3=new Robot();
		rbt3.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='navbar-container']/div[2]/ul/li/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='../Logout.aspx']")).click();
		Thread.sleep(1000);
		driver.close();
		
		  }
	}
	}

