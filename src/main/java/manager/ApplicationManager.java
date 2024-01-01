package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    WebDriver wd;

    public void path() {
        System.setProperty("webdriver.chrome.driver", "/Users/mpinevich/Tools/chromedriver");
    }

    public void init() {
        path();
        WebDriver wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/");

    }

    public void stop() {
        path();
        wd.quit();
    }

}
