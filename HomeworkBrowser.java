import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class HomeworkBrowser {
@Test
    public void openGooglePeageTest() {

        WebDriver driver = getDriver("firefox");
    }

    public  WebDriver getDriver (String browser) {

       switch (browser){
           case "chrome":
                String pathChrome = "C:\\Users\\Laptop\\Documents\\chromedriver_win32\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", pathChrome);

            return new ChromeDriver();

           case "firefox":
               String pathFirefox = "C:\\Users\\Laptop\\Documents\\geckodriver-v0.30.0-win64\\geckodriver.exe";
               System.setProperty("webdriver.gecko.driver", pathFirefox);

               return new FirefoxDriver();

           case "ie":
               String pathInternetExplorer = "C:\\Users\\Laptop\\Documents\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe";
               System.setProperty("webdriver.ie.driver", pathInternetExplorer);
               InternetExplorerOptions options = new InternetExplorerOptions();
               options.withInitialBrowserUrl("https://www.google.com/");

               return new InternetExplorerDriver(options);

           default:
               throw new InvalidArgumentException("Invaled browser name");
        }
    }
}
