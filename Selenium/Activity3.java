package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {
	public static void main(String[] args) {
		//initialize driver/ create a new instance of Firefox driver
		 WebDriver driver = new FirefoxDriver();
//		 WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
		
		// Open the browser or page
	    driver.get("https://training-support.net/webelements/login-form");
	    // Perform testing and assertions
	
	    //page interaction
	    System.out.println(driver.getTitle());
	   
	    //find username and password
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	    //find submit button and click it
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	   
	    //find the success message
	    String message = driver.findElement(By.xpath("//h1[contains(@class, 'text-emerald-500')]")).getText();
	    System.out.println(message);
//	    System.out.println(message.equals("Login Success!"));
	   
	    // Close the browser
	    //driver1.close(); //close active tab - no return type
	    // driver.quit(); //close all tabs - no return type
	}
}






