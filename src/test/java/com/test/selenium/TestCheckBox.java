package com.test.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.JavascriptExecutor;

public class TestCheckBox {

    private WebDriver driver;
    
    private By check1;
    
    private By check2;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        
        //carga de elementos
        check1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
        check2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");
    }

    @Test
    public void testPageBox() {
         /*Haciendo click*/
         driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
         boolean bCheck2 = driver.findElement(check2).isSelected();
         
         if(bCheck2)
            driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();//deseleccionar
         try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();   
        
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        
        if(driver.findElement(check1).isSelected())
            driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        if(driver.findElement(check2).isSelected())
            driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        
        String message = driver.findElement(check1).isSelected()==true?"Seleccionado":"Des Seleccionado";
        System.out.println("Valor de Conbo Box 1:"+message);
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
