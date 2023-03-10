package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(baseUrl);
	
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		 
		 WebElement password = driver.findElement(By.name("password"));
		 password.sendKeys("admin123");
		 
		 WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		 login.click();
		 Thread.sleep(2000);
		 
//forgot Password
		 
		 WebElement actualmsg = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']/a"));
			String actual=actualmsg.getText();
			System.out.println("Actual message:"+actual);
			
			String expected="Forgot your password?";
			
			if(actual.equals(expected))
			{
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
			
			//Search Functionality
			WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input"));
			search.sendKeys("PIM");
	 		WebElement searchResult = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span"));
			searchResult.click();
			
			//Verify to add employee with valid user name and password
			
			WebElement addemployee = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/div[1]/li/a"));
			addemployee.click();
			WebElement fname = driver.findElement(By.name("firstName"));
			fname.sendKeys("Priyanka");
			
			WebElement lname = driver.findElement(By.name("lastName"));
			lname.sendKeys("D");
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save.click();
			
			
			
			
			
}
}
