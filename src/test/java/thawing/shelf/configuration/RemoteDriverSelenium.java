package thawing.shelf.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverSelenium {

    private String username;
    private String automateKey;
    private String browserStack;


    public RemoteDriverSelenium() {
        username = System.getenv("USERNAME_BROWSER_STACK");
        automateKey = System.getenv("KEY_BROWSER_STACK");
        browserStack = "https://" + username + ":" + automateKey + "@hub-cloud.browserstack.com/wd/hub";
    }


    public WebDriver connectBrowserStack() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "chrome");
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("build", "First build");

        return new RemoteWebDriver(new URL(browserStack), caps);
    }
}
