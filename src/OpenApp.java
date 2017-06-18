import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenApp {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://www.saleforce.com");
		driver.findElement(By.xpath("//*[@id='pagewrap']/header/div/div/div/nav/div[1]/div/div[2]/div[4]/div/div/a/span[2]")).click();
		WebElement linkElement = driver.findElement(By.xpath("//*[@id='signup_link']"));
		linkElement.click();
		driver.findElement(By.xpath("//*[@id='UserFirstName']")).sendKeys("Pallavi");
		driver.findElement(By.xpath("//*[@id='UserLastName']")).sendKeys("Badwaik");
		driver.findElement(By.xpath("//*[@id='UserTitle']")).sendKeys("Software Engineer");
		driver.findElement(By.xpath("//*[@id='UserEmail']")).sendKeys("pallavibadwaik@gmail.com");
		driver.findElement(By.xpath("//*[@id='UserPhone']")).sendKeys("8793599145");
		driver.findElement(By.xpath("//*[@id='CompanyName']")).sendKeys("Test");
		WebElement employee = driver.findElement(By.xpath("//*[@id='form-container']/ul/li[14]/div/div[2]/a/span[1]"));
		employee.click();
		employee.sendKeys("1 - 5 employees");
		System.out.println(employee.getText());
		
		WebElement country = driver.findElement(By.xpath("//*[@id='form-container']/ul/li[15]/div/div[2]/a/span[1]"));
		country.click();
		country.sendKeys("India");
		System.out.println(country.getText());
		
		WebElement chk =driver.findElement(By.xpath("//*[@id='SubscriptionAgreement']"));
		System.out.println(chk.getText());
	}

}
