package co.com.rappi.certification.android.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver {
    public static WebDriver instance() throws MalformedURLException {
        DesiredCapabilities ability = new DesiredCapabilities();
        ability.setCapability("deviceName", "emulator-5554");
        ability.setCapability("platformName", "Android");
        ability.setCapability("platformVersion", "9.0");
        ability.setCapability("appPackage", "com.android.calculator2");
        ability.setCapability("appActivity", "com.android.calculator2.Calculator");
        ability.setCapability("noReset", "true");
        return new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), ability);
    }
}
