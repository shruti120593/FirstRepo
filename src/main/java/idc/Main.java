package idc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/QA_Training/SeleniumWebdriver/chromedriver");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("http://www.amazon.com");
		System.out.println(webdriver.getTitle());
		WebElement search = webdriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("pink lipstick");
		WebElement searchButton = webdriver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		searchButton.click();
		//readFromExcel();
		Thread.sleep(5000);
		webdriver.quit();
	}
}
