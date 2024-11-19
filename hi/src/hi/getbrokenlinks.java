package hi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getbrokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//broken url
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.findElement(By.className("footer_top_agile_w3ls"));
}

}
