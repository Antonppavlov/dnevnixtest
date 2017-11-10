package ru.test.dnevnix.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.test.dnevnix.Precondition;
import ru.test.dnevnix.block.AuthorizationBlock;

import static java.lang.Thread.sleep;

public class AuthorizationTest extends Precondition {

    private AuthorizationBlock authorizationBlock;

    @Before
    public void setUp() throws Exception {
        driver.get(baseUrl);

        authorizationBlock = new AuthorizationBlock(driver);
        authorizationBlock.authorization(ACCOUNT_DATA);
    }

    @Test
    public void checkAuthorization() throws InterruptedException {
        Assert.assertTrue(authorizationBlock.getButtonLogout().isDisplayed());
    }

    @Test
    public void checkLogout() throws InterruptedException {
        authorizationBlock.logOut();
        Assert.assertTrue(authorizationBlock.getButtonSingIn().isDisplayed());
    }

}
