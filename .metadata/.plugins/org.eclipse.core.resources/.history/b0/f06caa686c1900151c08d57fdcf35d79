package testone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net");

Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
Thread.sleep(3000);

driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();
System.out.println(" Clicking On Reports");
driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/a")).click();
System.out.println(" Clicking On Predefined Reports");
driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/ul/li[1]/a")).click();
System.out.println("Selecting ISDA");



String expectedTitle = "Documentation Tracker LLC";

String actualTitle = driver.getTitle();

if (expectedTitle.equals(actualTitle))

{
       System.out.println("Verification Successful - The correct title is displayed on the web page.");

}

else

{

       System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

}

/*if(driver.getTitle().contains("Documentation Tracker LLC"))
    //Pass
    System.out.println("Page title contains Documentation Tracker LLC");
else
    //Fail
    System.out.println("Page title doesn't contains \"Documentation Tracker LLC\" ");
driver.close();
*/
	}
	

}
