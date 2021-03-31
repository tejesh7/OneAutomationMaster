package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {
  public login(String username,String password) throws InterruptedException
  {
	  String currentdir=System.getProperty("user.dir");
System.out.println(currentdir);
String chromepath=currentdir+"\\Driver\\chromedriver.exe";
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", chromepath);
	  WebDriver driver=new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://dwa-awil1.test.cloud.fedex.com:8443/awi/");
	// driver.findElement(By.xpath("//input[@class='v-spinner-textfield']")).sendKeys("1503");

	 driver.findElement(By.xpath("//div[@class='v-expand']//*[@class=\"v-slot v-slot-uc4_common_simpleFormLayout v-slot-uc4_framework_login_dataArea\"]/div/div[5]/div/div/input[@type='text']")).click();
	 driver.findElement(By.xpath("//div[@class='v-expand']//*[@class=\"v-slot v-slot-uc4_common_simpleFormLayout v-slot-uc4_framework_login_dataArea\"]/div/div[5]/div/div/input[@type='text']")).sendKeys("1503");
	 driver.findElement(By.xpath("//div[@class='v-expand']//*[@class='v-slot v-slot-uc4_common_simpleFormLayout v-slot-uc4_framework_login_dataArea']/div/div[7]/div/input[@type='text']")).sendKeys(username);

	 driver.findElement(By.xpath("//div[@class='v-slot v-slot-uc4_common_simpleFormLayout v-slot-uc4_framework_login_dataArea']/div/div[11]//input[@type='password']")).sendKeys(password);
	 driver.findElement(By.xpath("//div[@tabindex='0']//span[@class='uc4_common_button-wrap']//span[@class='uc4_common_button-caption']")).click();
	 //	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//	  
//	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	 Thread.sleep(2000);
// driver.findElement(By.xpath("//input[@name='submit']")).click();
//  
//  
	driver.findElement(By.xpath("//div[@class='v-csslayout v-layout v-widget']//input[@tabindex='0']")).sendKeys("R04.JU.BTCHX");
	driver.findElement(By.xpath("//div[@class='v-slot']//span[@class='highlight']")).click();
	driver.findElement(By.xpath("//div[@tabindex='1']/div[2]/div[3]//div[@class='v-slot v-align-middle']//following-sibling::div[5]")).click();
	System.out.println(driver.findElement(By.xpath("//table[@class='v-table-table']//tr[1]/td[6]/div")).getText());
  }
	

}
