package ru.test.dnevnix.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.test.dnevnix.Precondition;
import ru.test.dnevnix.blocks.AuthorizationBlock;
import ru.test.dnevnix.blocks.Navigation;
import ru.test.dnevnix.blocks.NoteBlock;
import ru.test.dnevnix.blocks.NotePopUp;

public class NoteTest extends Precondition {

    private AuthorizationBlock authorizationBlock;

    @Before
    public void setUp() throws Exception {
        driver.get(baseUrl);
        authorizationBlock = new AuthorizationBlock(driver);
        authorizationBlock.authorization(ACCOUNT_DATA);

        new Navigation(driver).getButtonNote().click();
    }

    @After
    public void tearDown() throws Exception {
        authorizationBlock.logOut();
        Assert.assertTrue(authorizationBlock.getButtonSingIn().isDisplayed());
    }

    @Test
    public void checkCreate() throws Exception {
        new NoteBlock(driver).getButtonAddNote().click();

        NotePopUp notePopUp = new NotePopUp(driver);
        notePopUp.getInputNameNote().sendKeys(NOTE_NAME);
        notePopUp.getInputTextAreaNote().sendKeys(DATE.toString());
        notePopUp.getButtonAdd().click();
    }


    @Test
    public void checkDelete() throws Exception {
        new NoteBlock(driver).findNoteToValue(DATE).click();
        new NotePopUp(driver).getButtonDelete().click();
        driver.switchTo().alert().accept();
    }

}
