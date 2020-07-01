package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;;

public class CashbackHackServiceTest {

    @Test

    public void shouldReturn700IfAmount1300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(expected,actual);
    }

    @Test

    public void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test

    public void shouldReturn200IfAmount800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected,actual);
    }
}