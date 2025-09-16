package testngpackage;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpTest {
	//Getting the chromedriver instance to launch Chrome Browser
	WebDriver driver=new ChromeDriver();
	String baseurl="https://justbooks.in/signup?numBooks=2&numMonths=3";
	
	//Test the First Name field and simulate typing
  @Test
  public void testfirstname() {
	  driver.get(baseurl);
	  String fname=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[1]/input")).getTagName();
	  assertEquals(fname,"input");
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[1]/input")).sendKeys("Anu");
  }
  
  //Test the LastName field and simulate typing
  @Test
  public void testLastname() {
	  driver.get(baseurl);
	  String lname=driver.findElement(By.tagName("input")).getAriaRole();
	  assertEquals(lname, "lnametextbox");
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[2]/input")).sendKeys("Mitra");
  }
  
  //Test the Next button and simulate click
  @Test
  public void testNextButton() {
	  driver.get(baseurl);
	  driver.findElement(By.className("text-primary-red")).click();
  }
}

