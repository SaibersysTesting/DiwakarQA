package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) {
		String url="http://www.amazon.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(element).build().perform();
		element.click();
		element.sendKeys("iphone");
		//builder.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='searchDropdownBox']/option[8]"))).click().build().perform();
		//driver.findElement(By.xpath(".//*[@id='searchDropdownBox']/option[8]")).sendKeys("iphone");;
	}

}
