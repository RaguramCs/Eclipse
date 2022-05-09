package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Masspay extends Login{
	
	public void masspay() throws InterruptedException {
		Thread.sleep(3000);
		WebElement upload = driver.findElement(By.xpath("//a[text()=' Upload ']"));
		upload.click();
		WebElement mpay = driver.findElement(By.xpath("//button[text()='MassPay']"));
		mpay.click();
	}
	public static void main(String[] args) throws InterruptedException {
		Masspay m = new Masspay();
		m.log();
		m.masspay();
		
	}
	
	
	
	
	
	
}