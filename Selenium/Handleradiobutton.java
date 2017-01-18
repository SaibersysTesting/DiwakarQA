package AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleradiobutton {
public static void main(String[] args) {
	String url="http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html";
	System.setProperty("webdriver.chrome.driver","E:\\Java Softwares\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	List<WebElement> radio= driver.findElements(By.xpath(".//*[@name='lang' and @type='radio' ]"));
int radio_size=radio.size();
for(int i=0;i<radio_size;i++){
WebElement local_value=	radio.get(i);
String value=local_value.getAttribute("value");
System.out.println("The values are ------>" +value);
if(value.equalsIgnoreCase("Ruby")){
	local_value.click();	
}
}
	/*for(WebElement ele:local_radio){
	String local_value=ele.getAttribute("value");
	System.out.println(local_value);
}*/
}
}
