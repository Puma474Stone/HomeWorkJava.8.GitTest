package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithAllPositiveNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithMixedNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-10, 15, -5, 20, 0};
        long expected = 20;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithAllSameNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {42};
        long expected = 42;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }


    }


