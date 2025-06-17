package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4 {
	public static void main(String[] args) {
		//initialize driver/ create a new instance of Firefox driver
		 WebDriver driver = new FirefoxDriver();
//		 WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
		
		// Open the browser or page
	    driver.get("https://training-support.net/webelements/target-practice");
	    // Perform testing and assertions
	
	    //page interaction
	    System.out.println(driver.getTitle());
	  
//	    Using xpath:
//	    	Find the 3rd header on the page and print it's text to the console.
//	    	Find the 5th header on the page and print it's color.
	  
//	  	Using any other locator:
//	    	Find the purple button and print all it's classes.
//	    	Find the slate button and print it's text.
	  
	    System.out.println(driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText());
	    System.out.println(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));
	   // Color headingColor = Color.fromString(driver.findElement(By.xpath("h5[text()='Heading #5']")).getCssValue("color"));
	    System.out.println(driver.findElement(By.cssSelector("button.bg-purple-200")).getDomAttribute("class"));
	    System.out.println(driver.findElement(By.cssSelector("button.bg-purple-200")).getText());
	  
	}
}