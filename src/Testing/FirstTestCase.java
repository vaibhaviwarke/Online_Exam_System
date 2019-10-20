package Testing;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class FirstTestCase {  
  
    public static void main(String[] args) {  
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
    // Launch website  
    driver.get("http://localhost:8081/OnlineExamWeb/index.jsp");
    //driver.navigate().to("http://localhost:8081/OnlineExamWeb/index.jsp");
    driver.navigate().to("http://localhost:8081/OnlineExamWeb/login.jsp");
    	
    // Click on the search text box and send value  
    //driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
          
    // Click on the search button  
    //driver.findElement(By.name("btnK")).click();  
      
    }  
  
}  

