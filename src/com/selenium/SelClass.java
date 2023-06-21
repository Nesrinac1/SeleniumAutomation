package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrom.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://audituat.rayoman.com/login");
				

			    driver.findElement(By.xpath("//input[@id=\'Input_Email\']")).sendKeys("smitha.k@kovenantz.com");
			    driver.findElement(By.xpath("//input[@id=\'Input_Password\']")).sendKeys("P@ssword1");
			    driver.findElement(By.xpath("//button[@id=\'login-submit\']")).click();

				//System.out.println(driver.getTitle());
				//driver.quit();
				
	}

}
