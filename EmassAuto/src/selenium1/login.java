package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
  public login(String username,String password) throws InterruptedException
  {
	  String currentdir=System.getProperty("user.dir");
System.out.println(currentdir);
String chromepath=currentdir+"\\Driver\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromepath);
	  WebDriver driver=new ChromeDriver();
	 driver.get("https://test.secure.fedex.com/L3/eRA/index.html ");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	  
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@name='submit']")).click();
  
  }
	

}
