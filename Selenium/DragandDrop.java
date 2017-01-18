package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		String url="http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		String fromtext=from.getText();
		System.out.println(fromtext);
		WebElement to=driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		String totext=to.getText();
		System.out.println(totext);

		/*Actions builder=new Actions(driver);
		Action DragandDrop=builder.clickAndHold(from)
		.moveToElement(to)
		.release(to)
		.build();
		DragandDrop.perform();*/
		Actions builder = new Actions(driver);
		 
		Action dragAndDrop = builder.clickAndHold(from)
		 
		.moveToElement(to)
		 
		.release(to)
		 
		.build();
		 
		dragAndDrop.perform();
		
	}

}
