
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qa
 */
public class HelloSelenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // WebDriver driver = new ChromeDriver();
     
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.imdb.com/");
     
     System.out.println("URL: " + driver.getCurrentUrl());
     System.out.println("Title: " + driver.getTitle());
    
     WebElement searchBox = driver.findElement(By.id("sugestion-search"));
     searchBox.sendKeys("The Matrix");
     WebElement searchButton = driver.findElement(By.id("sugestion-search-button"));
     searchButton.click();
    }
    
}
