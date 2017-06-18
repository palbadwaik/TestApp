package selenium;

import java.util.List;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class xpath {
	
	public void openApp(){
		WebDriver driver = new FirefoxDriver();
		driver.get("hhtp://www.paytm.com");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		WebElement ele = driver.findElement(By.id("test"));
		int linkCount = links.size();
		String [] linkName = new String[linkCount];
		ele.getLocation();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(duration, unit);
		wait.pollingEvery(duration, unit);
		wait.ignoring(NoAlertPresentException);
	}
	
}
