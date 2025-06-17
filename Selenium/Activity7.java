package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class  Activity7{
	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		
		// Open the browser or page
	    driver.get("https://training-support.net/webelements/dynamic-controls");
	    System.out.println(driver.getTitle());
	   
	    //find text field
	    WebElement textBox = driver.findElement(By.id("textInput"));
	   
	    //check if the text box is enabled print result
	    System.out.println(textBox.isEnabled()); //false
	   
	    //click button
	    driver.findElement(By.id("textInputButton")).click();
	   
	    //check if the text box is enabled print result
	    System.out.println(textBox.isEnabled()); //true
	    //driver1.close(); //close active tab - no return type
	    // driver.quit(); //close all tabs - no return type
	}
}