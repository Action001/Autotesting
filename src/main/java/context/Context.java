package context;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class Context {

    private static ChromeDriver driver = new ChromeDriver();

    public static ChromeDriver initDriver(){
        return driver;
    }

    public static void runBrowser (String siteURL){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(siteURL);
    }

    public static void close(){
        System.out.println("Close COMPLETE");
        driver.quit();
    }
}


