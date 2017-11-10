package ru.test.dnevnix;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Precondition {
    protected WebDriver driver;
    protected String baseUrl;
    protected static final AccountData ACCOUNT_DATA = new AccountData("arinalucky97@gmail.com", "dfhgjbnhgvjbyh97@$jbk");
    protected static final String NOTE_NAME = "SeleniumNote";
    protected static final Date DATE = new Date();

    @Before
    public void setUpPrecondition() throws Exception {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        baseUrl = "https://dnevnix.ru/";
    }

    @After
    public void tearDownPrecondition() throws Exception {
        driver.close();
    }
}
