package Common;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities; 

public abstract class SeleniumWebDriverBuilder<SELF,DRIVER extends WebDriver,AndroidDriver> {
	
	protected URL urllink;
	protected String platform;
	protected String version;
	protected ChromeOptions withopt;
	protected DesiredCapabilities withCapability;
	
	public static FirefoxDriverWebDriver foFirefoxDriverWebDriverrDriver(){
		return new FirefoxDriverWebDriver();
		
	}
	
	public static ChromeDriverWebDriver foChromeDriverWebDriverWebDriverrDriver(){
		return new ChromeDriverWebDriver();
		
	}
	public static IEDriverWebDriver foIEDriverWebDriverWebDriverrDriver(){
		return new IEDriverWebDriver();
		
	}
	
	public static AndroidDriver forAndroidDriver(){
		return new MobileAndroidDriver();
		
	}
	
	public static class FirefoxDriverWebDriver extends SeleniumWebDriverBuilder<FirefoxDriverWebDriver,FirefoxDriver>{
		
		public FirefoxDriver build()
		{
		return new FirefoxDriver();
		}
		
	}
	

	public static class ChromeDriverWebDriver extends SeleniumWebDriverBuilder<ChromeDriverWebDriver,ChromeDriver>{
		
		public ChromeDriver build()
		{
			
		return new ChromeDriver(withopt);
		}
		
	}
	

	public static class IEDriverWebDriver extends SeleniumWebDriverBuilder<IEDriverWebDriver,InternetExplorerDriver>{
		public InternetExplorerDriver build()
		{
		return new InternetExplorerDriver();
		}
	
		
	}
	
	

	public static class MobileAndroidDriver extends SeleniumWebDriverBuilder<AndroidDriver,MobileDeviceAndroidDriver>{
		
	
		public MobileDeviceAndroidDriver build()
		{
		return new AndroidDriver(urllink,withCapability);
		}
		
	}

	public SELF withLink(URL urld)
	{
		this.urllink=urld;
		return (SELF) this;
		
	}
	public SELF withPlatform(String platform)
	{
		this.platform=platform;
		return (SELF) this;
		
	}
	public SELF withVersion(String version)
	{
		this.version=version;
		return (SELF) this;
		
	}
	public SELF withOption(ChromeOptions withOptionset)
	{
		this.withopt=withOptionset;
		return (SELF) this;
		
	}
	
	
	public SELF withAndroidCapa(DesiredCapabilities withCap)
	{
		this.withCapability=withCap;
		return (SELF) this;
		
	}
	
	
	
	public abstract DRIVER build();
	

}
