package ru.test.dnevnix.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class NoteBlock {

    private WebDriver driver;

    public NoteBlock(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonAddNote() {
        return driver.findElement(By.cssSelector("[value=\"Добавить заметку\"]"));
    }


    public WebElement findNoteToValue(Date date) {
       return driver.findElement(By.cssSelector("[id=\"spisok\"]")).findElement(By.cssSelector("[onclick*='"+date+"']"));
    }
}
