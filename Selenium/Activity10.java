package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize driver
		WebDriver driver= new FirefoxDriver();
						
		//Open browser on the page
		driver.get("https://training-support.net/webelements/drag-drop");
										
		//Page Interactions
		//Page Title
		System.out.println(driver.getTitle());
		
		WebElement w=driver.findElement(By.id("ball"));
		WebElement w1=driver.findElement(By.id("dropzone1"));
		WebElement w2=driver.findElement(By.id("dropzone2"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(w, w1).build().perform();
		
		System.out.println("Ball dropped in Dropbox1");
		
		act.pause(1000);
		
		act.dragAndDrop(w, w2).build().perform();
		
		System.out.println("Ball dropped in Dropbox2");
		driver.close();
	}
}

