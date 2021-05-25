package ru.netology;

public class StatstService{

@org.junit.jupiter.api.Test
    void findSales() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }

    {



    @org.junit.jupiter.api.Test
    void findMiddle() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findBiggest() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected1 = 5;
        int expected2 = 7;


        int actual = service.findSales(sales);

        assertEquals(expected1, expected2, actual);

    }


    @org.junit.jupiter.api.Test
    void findSmallest() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findLessThanMiddle() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findMoreThanMiddle() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 3;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);
    }
}



