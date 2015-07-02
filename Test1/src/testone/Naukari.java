package testone;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukari {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.naukri.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Click on Employer's Zone
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='empNavM']/ul/li[1]/a")).click();
        
        switchControlToLatestWindow(driver); //switch control to Employer's Zone window
    
        driver.findElement(By.xpath("//div[@class='headbg']//a[text()='Report a Problem']")).click(); //click on 'Report a Problem'
        //this will again open a new window
        switchControlToLatestWindow(driver); //switch control to 'Report a Problem' window
        
        driver.findElement(By.xpath("//input[@name='strName']")).sendKeys("jdhjhgdjhgj1222"); //pass some value to Your name field to confirm our control is there
}
    //this is a method to switch the control to the latest opened window
    public static void switchControlToLatestWindow(WebDriver driver){
        Iterator<String> browsers = driver.getWindowHandles().iterator();
        while(browsers.hasNext()){
            driver.switchTo().window(browsers.next());
        }
    }

}