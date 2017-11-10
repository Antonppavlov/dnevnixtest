package ru.test.dnevnix.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.test.dnevnix.AccountData;

public class AuthorizationBlock {

    private WebDriver driver;

    public AuthorizationBlock(WebDriver driver) {
        this.driver = driver;
    }

    public void authorization(AccountData accountData) {
        getInputLogin().clear();
        getInputLogin().sendKeys(accountData.getUser());
        getInputPassword().clear();
        getInputPassword().sendKeys(accountData.getPassword());
        getInputLogin().click();
        getButtonSingIn().click();
    }

    public void logOut() {
        getButtonLogout().click();
    }

    public WebElement getInputLogin() {
        return driver.findElement(By.name("username"));
    }

    public WebElement getInputPassword() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getButtonSingIn() {
        return driver.findElement(By.cssSelector("[value=\"Войти\"]"));
    }

    public WebElement getButtonLogout() {
        return driver.findElement(By.cssSelector("[value=\"Выйти\"]"));
    }

}
