package ru.test.dnevnix.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {

    private WebDriver driver;

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonNote() {
        return driver.findElement(By.cssSelector("[href=\"/index.php/zametka\"]"));
    }

}
