package com.webdemo.code;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class TestWeb {
    public static void main(String[] args) {
      
    // Here we need to create logger instance so we need to pass Class name for 
     //which  we want to create log file in my case Google is class name
        Logger logger=Logger.getLogger(TestWeb.class.getName());
 
        System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver2\\chromedriver.exe");
   	 
        // Open browser
        WebDriver driver = new ChromeDriver();
        logger.info("Chrome Opened");
        
        
     // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Implicit wait given");
      
        
        driver.manage().window().maximize();
        logger.info("Browser Maximized");
      
        
 
        // Load application
        driver.get("http://www.google.com");
        logger.info("App launched");
        
  
        // type Selenium
        driver.findElement(By.name("q")).sendKeys("Selenium");
        logger.info("keyword type");  
 
     
        
       
        
    }
}