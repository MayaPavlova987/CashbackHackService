package ru.netology;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {




    @Test
    public void shouldRemainWhenAmountLessThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainWhenAmountZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldWhenAmountMoreThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBoundaryValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldWhenAmountEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}


