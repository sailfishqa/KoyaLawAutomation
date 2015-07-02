package DocuTrackerPac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticClass {
    
    public static WebDriver driver = null;
    
    static {
        
        driver = new FirefoxDriver();

    }

}