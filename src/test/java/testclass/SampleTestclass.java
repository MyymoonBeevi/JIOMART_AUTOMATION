package testclass;
import java.awt.AWTException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ProjectMethods;


public class SampleTestclass extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="Sample E-Commerce Appliaction Automation";
		testDescription="Automating JioMart Application";
		testNodes="Base";
		category="Smoke";
		authors="Mymoon";
		browserName="chrome";
	} 

	@Test
	public static void verifyBrokenLinks() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();
		login
		.verifyBrokenLink();
	}

	@Test
	public static void click_SigninButton() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton();
	}

	@Test
	public static void loginWithValidMobileNo() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton()
		.enterMobileNo();
	}
	
	@Test
	public static void enterOtpToLogin() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton()
		.enterMobileNo()
		.enterOtp();
	}
	@Test
	public static void enterVerifyButtonToLogin() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton()
		.enterMobileNo()
		.enterOtp()
		.clickVerify();
	}
	
	@Test
	public static void SearchProduct() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton()
		.enterMobileNo()
		.enterOtp()
		.clickVerify()
		.search()		
		.searchProduct();
	}
	@Test
	public static void checkCartBeforeAddedProduct() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton()
		.enterMobileNo()
		.enterOtp()
		.clickVerify()
		.search()		
		.searchProduct()
		.viewcart();
	}
	
	@Test
	public static void addProductToCart() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton()
		.enterMobileNo()
		.enterOtp()
		.clickVerify()
		.search()		
		.searchProduct()
		.addToCart();
	}
	
	@Test
	public static void checkCartAfterAddedProduct() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage();

		login
		.clickSigninButton()
		.enterMobileNo()
		.enterOtp()
		.clickVerify()
		.search()		
		.searchProduct()
		.addToCart()
		.viewcart();
	}

}
