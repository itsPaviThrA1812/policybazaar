package demo3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
import java.io.IOException;
import java.util.List;
 
public class HealthInsurance {
    private static final char[] options = null;
 
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new EdgeDriver();
 
        driver.manage().window().maximize();
 
        Thread.sleep(2000);
 
        driver.get("https://www.policybazaar.com/");
 
        Thread.sleep(2000);
 
        // Find the "Insurance Products" option and click on it
        WebElement insuranceProductsOption = driver.findElement(By.xpath("//a[normalize-space()='Insurance Products']"));
        insuranceProductsOption.click();
        Thread.sleep(3000);
 
        // Loop through the list of health insurance options and print each one
        for(int i = 1; i <= 12; i++) {
            String healthOptionXPath = "//div[@class='ruby-col-3 hidden-md'][2]//ul//li[" + i + "]//a//span";
            WebElement healthOption = driver.findElement(By.xpath(healthOptionXPath));
            System.out.println(healthOption.getText());
        }
 
        //driver.close();
    }
}