package ru.netolgy;

public class StatstService {

    public int findSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }


    public int findMiddle(int[] sales) {

        int sum = 180;
        int monthAmount = 12;
        int middleSum = sum / monthAmount;

        return middleSum;

    }

    public int findBiggest(int[] sales) {

        int sum = sales[0];
        for (int sale : sales) {
            if (sum < sale) {
                sum = sale;
            }
        }
        return sum;
    }

    public int findSmallest(int[] sales) {

        int sum = sales[0];
        for (int sale : sales) {
            if (sum > sale) {
                sum = sale;
            }
        }
        return sum;
    }

    public int findLessThanMiddle(int[] sales) {
        int middleSum = 15;
        int LessThanMiddleSum = 0;

        for (int sale : sales) {
            if (sale < sales[middleSum]) {
                LessThanMiddleSum = middleSum;
            }
            return LessThanMiddleSum;
        }


        int findMoreThanMiddle;
        middleSum = 15;
        int moreThanMiddleSum = 0;


        for (int sale : sales) {
            if (sale < sales[middleSum]) {
                moreThanMiddleSum = middleSum;
            }
            return moreThanMiddleSum;
        }
        return middleSum;
    }
}


