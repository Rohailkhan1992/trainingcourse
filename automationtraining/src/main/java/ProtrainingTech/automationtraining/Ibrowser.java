package ProtrainingTech.automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Toughbook 31\\eclipse-workspace\\automationtraining\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://www.amazon.com");
driver.navigate().refresh();	
driver.navigate().back();	
//Thread.sleep(6000);
driver.navigate().forward();	
//Thread.sleep(6000);	
driver.manage().window().maximize();	
String windowofhandle=driver.getCurrentUrl(); 	
System.out.println(windowofhandle);	
String currenturlpage=driver.getCurrentUrl();	
System.out.println(currenturlpage);	
driver.close();

	
	
	}

}
