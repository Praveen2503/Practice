package activities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity8 {
	public static void main(String args[])throws InterruptedException {
		
				WebDriver driver= new FirefoxDriver();
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				
				
				//open the browser or page
				driver.get("https://training-support.net/webelements/mouse-events");
				System.out.print(driver.getTitle());
				
				Actions buldier= new Actions(driver);
				WebElement cargoLock=driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
				WebElement cargotoml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
				WebElement srcFile=driver.findElement(By.xpath("//h1[text()='src']"));
				WebElement targetFile=driver.findElement(By.xpath("//h1[text()='target']"));
				
				buldier.click(cargoLock).pause(5000).click(cargotoml).build().perform();
				System.out.println(driver.findElement(By.id("result")).getText());
				buldier.doubleClick(srcFile).pause(5000).contextClick(targetFile).perform();
				buldier.click(driver.findElement(By.cssSelector("span.ml-3"))).build().perform();
				System.out.println(driver.findElement(By.id("result")).getText());
				driver.quit();
				//Find all the buttons
				
				driver.quit();
			}
		}