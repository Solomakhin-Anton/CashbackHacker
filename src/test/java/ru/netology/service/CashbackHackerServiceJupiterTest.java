package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackerServiceJupiterTest {

    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldReturn1000IfAmountIs0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmountIs1() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1IfAmountIs999() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmountIs1001() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmountIs1500() {
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

}