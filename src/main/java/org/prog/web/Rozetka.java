package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Rozetka {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rozetka.com.ua/ua");

            WebElement AmazonSearch = driver.findElement(By.xpath("//input[@class='search-form__input ng-valid ng-dirty ng-touched']"));
            AmazonSearch.sendKeys("Iphone 15");
            AmazonSearch.sendKeys(Keys.ENTER);

            List<WebElement> searchResult = new WebDriverWait(driver, Duration.ofSeconds(60L))
                    .until(ExpectedConditions.numberOfElementsToBe(
                            By.xpath("//span[@class='goods-tile__title'][1]"),1));


        }
        finally {
            driver.quit();
        }
    }
}
