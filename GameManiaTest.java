package webdriver;

import org.openqa.selenium.Dimension;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;



public class GameManiaTest {
	
	private WebDriver driver;
	
	@Before
	public void testConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void navTest( ) {
		
		try {
		driver.get("http://localhost:4200/");
		Thread.sleep(1000);
		
		//Desktop Test
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("next")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.id("prev")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prev")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("pesquisa")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("pesquisa")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,650)");
		Thread.sleep(2000);
		
		driver.findElement(By.className("bar2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("bar1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("marketButton")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scroll(650 ,0)");
		Thread.sleep(1500);
		
		driver.findElement(By.id("icon1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("close")).click();
		//
		
		Thread.sleep(2000);
		Dimension d = new Dimension(768, 1024);	
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		//Tablet Test
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("next")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.id("prev")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prev")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scroll(0,650)");
		Thread.sleep(2000);
		
		driver.findElement(By.className("bar2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("bar1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("marketButton")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scroll(650 ,0)");
		Thread.sleep(1500);
		
		driver.findElement(By.id("icon1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("close")).click();
		//
		
		Thread.sleep(2000);
		Dimension d2 = new Dimension(500, 900);	
		driver.manage().window().setSize(d2);
		Thread.sleep(1000);
		
		//SmartPhone Test
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("next")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.id("prev")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prev")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scroll(0,650)");
		Thread.sleep(2000);
		
		driver.findElement(By.className("bar2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("bar1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("marketButton")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scroll(650 ,0)");
		Thread.sleep(1500);
		
		driver.findElement(By.id("icon1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("close")).click();
		//
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//login
		driver.findElement(By.id("icon2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("loginBot")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("test.test@email.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("senha")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("senha")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.className("loginButton")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("icon2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("exit")).click();
		Thread.sleep(1000);
		//
		
		//login error
		driver.findElement(By.id("icon2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("loginBot")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("error.test@email.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("senha")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("senha")).sendKeys("");
		Thread.sleep(1000);
		
		driver.findElement(By.className("loginButton")).click();
		Thread.sleep(2500);
		//
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@After
	public void quitConfig( ) {
		driver.quit();
	}

}
