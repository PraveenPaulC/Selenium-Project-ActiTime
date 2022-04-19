package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Stage 1: Declaratiom
		@FindBy(id="username")
		private WebElement usernameTb;
		
		@FindBy(name="pwd")
		private WebElement passwordTb;
		
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement loginBtn;
		
		//Stage 2 : Initialization
		public LoginPage(WebDriver driver) //Public due to visibility in TestCase1, it will show in suggestions there if u don't make it public
		{
			PageFactory.initElements(driver, this);
		}
		
		//Stage 3 : Utilization
		public void setusername(String un)
		{
			usernameTb.sendKeys(un);
		}
		
		public void setpassword(String pwd)
		{
			passwordTb.sendKeys(pwd);
		}
		
		public void click_login()
		{
			loginBtn.click();
		}

}
