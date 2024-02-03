package org.prog.web.page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
public class RozetkaPage {
    public final WebDriver driver;

    public RozetkaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("https://rozetka.com.ua/ua");
    }

    public void setSearchValue(String searchValue) {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(searchValue);
    }

    public void performSearch() {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(Keys.ENTER);
    }

    public List<WebElement> getSearchHeaders(String withValue) {
        String headerPartialText = String.format("//span[contains(text(), '%s')]", withValue);
        return new WebDriverWait(driver, Duration.ofSeconds(30L))
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(
                        By.xpath(headerPartialText), 3));
    }
}
