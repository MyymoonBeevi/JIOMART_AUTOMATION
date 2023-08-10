package utils;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;

public interface WdMethods {

	public void startApp(String browser, boolean bReturns) throws MalformedURLException ;

	public WebElement locateElement(String locator, String locValue) ;	

	public WebElement locateElement(String locValue) ;	

	public void type(WebElement ele, String data) ;

	public void type_enter(WebElement ele, String data) ;

	public void click(WebElement ele);

	public long takeSnap();

	public void closeBrowser();		

	public void closeAllBrowsers();

}



