package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
@org.testng.annotations.Test
        public void testRemain () {
    CashbackHackService service = new CashbackHackService();
    int amount = 1000;
    int actual = service.remain(amount);
    int expected = 0;
    assertEquals(actual, expected);
}
    @org.testng.annotations.Test
    public void testRemainWithCashBack () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithoutCashBack () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashBackLimit () {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainAmountOne () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainAmountZero () {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashBackNext1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashBackAmount2000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}