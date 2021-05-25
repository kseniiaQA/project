package ru.netolgy;
import static org.junit.jupiter.api.Assertions.*;

public class StatstService {
    public int findSales(int[] sales) {

        int sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }


    public int findMiddle(int[] sales) {

        int sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum / 12;

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

        int sum = 0;
        for (long sale : sales) {
            if (sum < 12) ;

        }
        return sum;
    }

    public int findMoreThanMiddle(int[] sales) {

        int sum = 0;
        for (long sale : sales) {
            if (sum > 12) ;

        }
        return sum;
    }
}
