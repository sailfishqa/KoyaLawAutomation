package DocuTrackerPac;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Create_ISDADraftAgreement {
  	public static void CreateISDADraft() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.out.println("Open Broswer and Login");
    	
    	WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net/(S(ukmiexftzbxklpkc3xm4yobc))/DocutrackerLogin.aspx");
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("maniadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		
		System.out.println("Create New PB Draft Agreement");
		
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/ul/li[1]/a")).click();
		  //Create ISDA Draft Agreement
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCounterParty"))).selectByIndex(1);
		 Thread.sleep(3000);
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClient"))).selectByIndex(3);
		  Thread.sleep(2000);
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClientEntities"))).selectByIndex(1);
		  Random randomGenerator = new Random();
		  boolean i = true;
		  while(i)
		  {
		   int r = randomGenerator.nextInt(12);
		   System.out.println("Generated : " + r);
		   
		   i=false;  
		  Thread.sleep(4000);
		  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByIndex(r);
		  }      
		  
		  boolean j= true;
		  while(j)
		  {
		   int r = randomGenerator.nextInt(31);
		   System.out.println("Generated : " + r);
		   j=false;  
		  Thread.sleep(4000);
		  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByIndex(r);
		  }      
		  
		  int myArray[]={1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,
		    2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
		  Random generator = new Random();
		  int dfd = generator.nextInt(myArray.length);
		  System.out.println(myArray[dfd]);
		  
		  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByIndex(dfd);
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddFormofISDA"))).selectByValue("1992");
		  driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
          Thread.sleep(2000);
         
          System.out.println("Create New PB Draft version");
          
          //Create ISDA Draft Version
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByIndex(1);
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_dd"))).selectByValue("2");
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_yyyy"))).selectByValue("2020");
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_dfParty"))).selectByValue("3");
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddAgreementslist"))).selectByValue("Not Applicable");
		  driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		  
		  System.out.println("Answer one provision");
		  
		  driver.findElement(By.linkText("Answer")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("ContentPlaceHolder1_btnShcedule")).click();
          driver.findElement(By.linkText("Net Asset Value")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A']")).sendKeys("Net Asset Value");
          driver.findElement(By.id("ContentPlaceHolder1_ctl00_btnSubmit")).click();
          Thread.sleep(2000);
          
          System.out.println("Check for Single report Generation");
          
          String parentwindow=driver.getWindowHandle();//For Parent window 
		     driver.findElement(By.id("ContentPlaceHolder1_previewisda")).click();
		       Thread.sleep(10000);
		               for (String Child_Window : driver.getWindowHandles())
		                 {
		                driver.switchTo().window(Child_Window); 
		                      }
		                 Thread.sleep(2000);
		                 driver.findElement(By.linkText("Generate PDF")).click();//Switch to Child window
		                 Thread.sleep(3000);
		                 driver.findElement(By.id("btnGeneratePDF")).click();
		                 Thread.sleep(5000);
		                 Robot rb=new Robot();
		                 rb.keyPress(KeyEvent.VK_ENTER);
		                 Thread.sleep(2000);
		        		         driver.close();     //Close Child window
		         driver.switchTo().window(parentwindow); //Finally Switch to main window
		         driver.close(); 
	}
    
    
}
