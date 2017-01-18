package AutomationFramework;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("http://toolsqa.com/automation-practice-form/");
driver.manage().window().maximize();
//1st
java.util.List<WebElement> oCheckbox=driver.findElements(By.name("sex"));
System.out.println("List of web elements are" +oCheckbox);
boolean bvalue=false;
bvalue=oCheckbox.get(0).isSelected();
if(bvalue=true){
	oCheckbox.get(1).click();
	System.out.println("Female check box is clicked");
}
else{
	oCheckbox.get(0).click();
}
//2nd
WebElement rdo_button=driver.findElement(By.id("exp-2"));
rdo_button.click();
//3rd
java.util.List<WebElement> chkbxprofession=driver.findElements(By.name("profession"));
int Isize=chkbxprofession.size();
for(int i=0;i<=Isize;i++){
	String svalue=chkbxprofession.get(i).getAttribute("value");
	if(svalue.equalsIgnoreCase("Automation Tester")){
		chkbxprofession.get(i).click();
	}
}
//4th
WebElement oCheckbox1=driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
oCheckbox1.click();
	}




	}


