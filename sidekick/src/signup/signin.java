package signup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
	     //WebDriver driver= wait ChromeDriver();
			
		//go to the web site
		driver.get("https://sidekick.evilgeniusgames.com/");
		driver.manage().window().maximize();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 // Create WebDriverWait instance

		WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//form[@name='signupform']//div//input[@placeholder='name@host.com']")));
		
		usernameField.sendKeys("qa@yopmail.com");
		
		WebElement name= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//form[@name='signupform']//div//div//input[@name='requiredAttributes[given_name]']")));
         name.sendKeys("Puneet");
         
         WebElement sname= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//form[@name='signupform']//div//div//input[@name='requiredAttributes[family_name]']")));
         sname.sendKeys("QA");
         
		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//input[@placeholder='Password']")));
		password.sendKeys("Test@123");
		
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//button[@name='signUpButton'][normalize-space()='Sign up']")));
		
        button.click();
        
        System.out.println("A New Account has been Created succefully");
		
	}

}
