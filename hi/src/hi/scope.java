package hi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		// get count for all the links in the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());

		// get count for all the link in the footer section
		WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());

		// get count for all the link in the column section
		WebElement Columndriver = Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Columndriver.findElements(By.tagName("a")).size());
		
		//open all the tabs

			for (int i = 1; i < Columndriver.findElements(By.tagName("a")).size(); i++) 
		{
			//click the keyboard keys
			String clickble=Keys.chord(Keys.COMMAND,Keys.ENTER);
			//opening tabs here
			Columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickble);
			Thread.sleep(5000L);
			//now get the  window handle
			
			
			
			
		}
		
			Set<String>  hi=driver.getWindowHandles();
			Iterator<String> it =hi.iterator();
			//switch windows here and get the title
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			System.out.println("chkte fatte ho geya km");

	}

}
