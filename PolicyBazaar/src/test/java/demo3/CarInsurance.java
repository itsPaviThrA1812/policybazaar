package demo3;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
public class CarInsurance{
	public static void main(String[]args) throws InterruptedException, IOException {
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
 
// Set implicit wait time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
Thread.sleep(2000);

driver.get("https://www.policybazaar.com/");
     

WebElement carinsurance = driver.findElement(By.xpath("//div[@class='prd-block car']//div[@class='shadowHandlerBox']"));
carinsurance.click();

        
        // Click on the new car
        WebElement newcar = driver.findElement(By.xpath("//a[normalize-space()='Buying a new car? Click here']"));
newcar.click();
        
        // Click on the state
        WebElement state = driver.findElement(By.xpath("//span[@id='spn6']"));
state.click();
        
        // wait time added
        Thread.sleep(2000);
        
     // Click on the car number
        WebElement carnumber = driver.findElement(By.xpath("//span[normalize-space()='TN01']"));
carnumber.click();
        
        // Click on the car
        WebElement car = driver.findElement(By.xpath("//span[@class='renault']"));
car.click();
        Thread.sleep(2000);
 
     // Click on the carmodel
        WebElement carmodel= driver.findElement(By.xpath("//b[normalize-space()='DUSTER']"));
carmodel.click();
       
     // Click on the fuel type
        WebElement fuel= driver.findElement(By.xpath("//span[@id='Petrol']"));
fuel.click();
        
        // Click on the car variant
        WebElement variant= driver.findElement(By.xpath("//b[normalize-space()='RXE PETROL 104 PS (1598 cc)']"));
variant.click();
        
          
// Click on the Details WebElement name
  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pavithra");
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavithra12gmail.com");
  driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("7653478989");
     
      Thread.sleep(2000); ///delay
      
      File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      Files.copy(f,new File("C:\\Users\\2327602\\OneDrive - Cognizant\\Screenshot.jpg"));
      
  }
}