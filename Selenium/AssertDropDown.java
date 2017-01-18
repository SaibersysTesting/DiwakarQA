package Assertionsndverification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssertDropDown {
	@Test
	public void SelectingValues() throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\Java Softwares\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month_dd=driver.findElement(By.id("month"));
	Select month_list=new Select(month_dd);
	//List of Expected Values
	/*List<String> e=new List()<String>;
	e.add("Month");
	e.add("Jan");
	e.add("Feb");
	e.add("Mar");
	e.add("Apr");
	e.add("May");
	e.add("Jun");
	e.add("Jul");
	e.add("Aug");*/

//List of Actual Values	
List<WebElement>  Actualvalues=month_list.getOptions();
for(WebElement e:Actualvalues){
	System.out.println(e.getText());
}
	driver.close();
	driver.quit();
	}
}