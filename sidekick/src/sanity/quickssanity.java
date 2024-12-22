package sanity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class quickssanity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
	     //WebDriver driver= wait ChromeDriver();
			
		//go to the web site
		driver.get("https://sidekick.evilgeniusgames.com/");
		driver.manage().window().maximize();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		 // Create WebDriverWait instance

		WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']")));
		
		usernameField.sendKeys("qa@yopmail.com");

		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']")));

		password.sendKeys("Test@123");
		
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']")));

		button.click();
	    System.out.println(" Account has been login successfully");
	    
	    //click on the header
	    WebElement first=driver.findElement(By.xpath("//a[contains(text(),'New Player Guide')]"));
	    
	    first.sendKeys(Keys.COMMAND,Keys.RETURN);
	    

	}

}
