package org.prog.web.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class RozetkaPageDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            RozetkaPage rozetkaPage = new RozetkaPage(driver);
            rozetkaPage.loadPage();
            rozetkaPage.setSearchValue("iPhone 15 Pro");
            rozetkaPage.performSearch();

            List<WebElement> searchHeaders = rozetkaPage.getSearchHeaders("iPhone 15 Pro");

            if (searchHeaders.size() >= 3) {
                System.out.println("iPhone 15 Pro is found!");
            }
        } finally {
            driver.quit();
        }
    }
}
