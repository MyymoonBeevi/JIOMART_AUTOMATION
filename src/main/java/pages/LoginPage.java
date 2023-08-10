package pages;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeMethods;


public class LoginPage extends SeMethods{

	WebDriverWait wait = new WebDriverWait(driver, 30);

	public LoginPage verifyBrokenLink() {
		brokenLinks();
		return this;
	}

	public LoginPage clickSigninButton() throws InterruptedException, AWTException
	{
		WebElement signin = locateElement("xpath","//span[text()='Sign In']");
		click(signin);
		return this;
	}

	public LoginPage clickLoginButton()
	{
		WebElement Login = locateElement("xpath","Login");
		click(Login);
		return this;
	}

	public LoginPage enterMobileNo() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginfirst_mobileno']")));
		WebElement enter_mobileno = locateElement("xpath","//input[@id='loginfirst_mobileno']");
		type_enter(enter_mobileno,"6381592198");
		return this;
	}
	public LoginPage enterOtp()
	{
		WebElement enterOtp = locateElement("xpath","//*[@id='id_input_0']");
		click(enterOtp);
		return this;
	}
	public LoginPage clickVerify() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class = 'ng-star-inserted j-button j-button-size__medium j-button-state__normal primary has-title j-button-flex']")));
		WebElement Verify = locateElement("xpath","//div[text()=' Verify ']");
		click(Verify);
		return this;
	}

	public LoginPage search()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search JioMart']")));
		WebElement search = locateElement("xpath","//input[@placeholder='Search JioMart']");
		type_enter(search, "Mobile");
		return this;
	}

	public LoginPage addToCart() 
	{
		WebElement addtocart = locateElement("xpath","(//button[text()='Add to Cart'])[1]");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");
		try {
			scrolldown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		click(addtocart);
		return this;
	}

	public LoginPage searchProduct()
	{

		WebElement searchProduct = locateElement("xpath","//div[text()= ' OnePlus Nord CE 2 Lite 5G,128 GB,6 GB RAM,Blue Tide,Mobile Phone ']");
		click(searchProduct);
		return this;
	}

	public LoginPage viewcart()
	{
		WebElement viewcart = locateElement("xpath","(//button[@id='btn_minicart'])");
		click(viewcart);
		return this;
	}





}
