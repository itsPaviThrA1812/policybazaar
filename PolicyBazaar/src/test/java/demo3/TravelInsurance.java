package demo3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
 
 
public class TravelInsurance {
	private static final String FileUtils = null;
 
public static void main(String[] args) throws InterruptedException, IOException {
    
        // Launch Chrome browser
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // Set implicit wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Thread.sleep(2000);
       
driver.get("https://www.policybazaar.com/");
        //clicking travel insurance
        driver.findElement(By.xpath("//div[7]//a[1]//div[1]//div[1]")).click();
        Thread.sleep(3000);
        //clicking country
        driver.findElement(By.xpath("//p[text()='United Kingdom']")).click();
        Thread.sleep(5000);
        
        // Click on the "Enter" option
       driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        Thread.sleep(3000);
       
     // Find and input start date & End Date and Click Next
        driver.findElement(By.xpath("//div[@class='MuiPickersDateRangePickerInput-root']//div[1]//div[1]//div[1]//input[1]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@aria-label='Mar 20, 2024']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label='Mar 25, 2024']")).click();
        Thread.sleep(2000);
        //SelectInput
         driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        
     // Fill Person Details
        WebElement Noofpersons = driver.findElement(By.xpath("//label[normalize-space()='2']"));
Noofpersons.click();
        Thread.sleep(1000);
        //person1 click
        driver.findElement(By.xpath("(//div[@id='divarrow_undefined'])[1]")).click();
        Thread.sleep(1000);
        //person age 1
        driver.findElement(By.xpath("//label[normalize-space()='21 years']")).click();
        Thread.sleep(1000);
        //person 2 click
        driver.findElement(By.xpath("//div[@class='place-holder AgeSelector-place-holder']")).click();
        Thread.sleep(1000);
        //person 2 age
        driver.findElement(By.xpath("//label[normalize-space()='22 years']")).click();
        Thread.sleep(1000);
        
        // Click on the "Enter" option
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        Thread.sleep(3000);
        
        // Click on the "medical condition" option
        driver.findElement(By.xpath("//input[@id='ped_no']")).click();
        Thread.sleep(3000);
        
        // enter Mobile Number
         driver.findElement(By.xpath("//input[@id='mobileNumber']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9442728460");
        
       //click view plans
         driver.findElement(By.xpath("//button[normalize-space()='View plans']")).click();
        Thread.sleep(3000);
        
        //Sorting cheapest package
         driver.findElement(By.xpath("//section[@class='newFilterSection sort']//details//summary")).click();
         driver.findElement(By.xpath("//input[@id='17_sort']")).click();

}

}

     
       