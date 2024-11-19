package hi;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class placeorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String[] items = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < Products.size(); i++) {
			String hi = Products.get(i).getText();

			List items1 = Arrays.asList(items);
			if (hi.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

			}

		}
	}

}
