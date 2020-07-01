package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test

    public void shouldReturn700IfAmount1300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test

    public void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test

    public void shouldReturn200IfAmount800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual,expected);
    }
}