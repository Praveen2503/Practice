package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5 {
	public static void main(String[] args) {
		//initialize driver/ create a new instance of Firefox driver
		 WebDriver driver = new FirefoxDriver();
//		 WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
		
		// Open the browser or page
	    driver.get("https://training-support.net/webelements/dynamic-controls/");
	
	    //page interaction
	    System.out.println(driver.getTitle());
	   
	    WebElement checkbox = driver.findElement(By.id("checkbox"));
	    System.out.println(checkbox.isDisplayed());
	   
	    driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
	    System.out.println(checkbox.isDisplayed()); //true
	   
	  
	   
	}
}