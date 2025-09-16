package testngpackage;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


//This test class is for testing linked in home page and accessing webelements
public class testlinkedin {
	
  @Test
  public void testtagname() {
	  WebDriver driver=new EdgeDriver();  //Using Edge Browser 
		driver.navigate().to("https://www.linkedin.com/");
		String tagname=driver.findElement(By.linkText("Sign in with email")).getTagName();
		System.out.println("Tag is: " + tagname);
		assertNotEquals("link", "a");
		tagname=driver.findElement(By.name("trk")).getTagName();
		System.out.println("Tag is: " + tagname);
		driver.findElement(By.linkText("Sign in with email")).click();

	  
  }
}
