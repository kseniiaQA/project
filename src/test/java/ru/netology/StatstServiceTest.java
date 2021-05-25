package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

class StatstServiceTest {

    @org.junit.jupiter.api.Test
    void findSales() {
        StatstServiceTest service = new StatstServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findMiddle() {
        StatstServiceTest service = new StatstServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findBiggest() {
        StatstServiceTest service = new StatstServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected1 = 5;
        int expected2 = 7;


        int actual = service.findSales(sales);

        assertEquals(expected1, expected2, actual);

    }


    @org.junit.jupiter.api.Test
    void findSmallest() {
        StatstServiceTest service = new StatstServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findLessThanMiddle() {
        StatstServiceTest service = new StatstServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findMoreThanMiddle() {
        StatstServiceTest service = new StatstServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 3;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);
    }
}



