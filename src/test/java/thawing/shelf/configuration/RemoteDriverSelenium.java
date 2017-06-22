package thawing.shelf.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverSelenium {

    private static final String USERNAME = "";
    private static final String AUTOMATE_KEY = "";
    private static final String BROWSER_STACK = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public WebDriver connectBrowserStack() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "chrome");
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("build", "First build");

        return new RemoteWebDriver(new URL(BROWSER_STACK), caps);
    }
}
