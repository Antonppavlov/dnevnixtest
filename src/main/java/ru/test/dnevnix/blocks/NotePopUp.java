package ru.test.dnevnix.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotePopUp {

    private WebDriver driver;

    public NotePopUp(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getInputNameNote() {
        return driver.findElement(By.cssSelector("[id=\"modalwindow\"] [id=\"h2\"]"));
    }

    public WebElement getInputTextAreaNote() {
        return driver.findElement(By.cssSelector("[id=\"p\"]"));
    }

    public WebElement getButtonAdd() {
        return driver.findElement(By.cssSelector("[id=\"ed\"]"));
    }

    public WebElement getButtonDelete() {
        return driver.findElement(By.cssSelector("[id=\"modalwindow\"] a"));
    }
}
