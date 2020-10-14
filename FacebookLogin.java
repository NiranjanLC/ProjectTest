import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Enter valid email id here");

		driver.findElement(By.xpath("//input[@id='pass']")).click();		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Enter correct password here");
		
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		
		boolean b = driver.findElement(By.xpath("//a[@aria-label='Home']")).isDisplayed();
		
		System.out.println(b);
		driver.quit();
	}

}
