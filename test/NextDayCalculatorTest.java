import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("test 1/1/2018 => 2/1/2018")
    void testGetNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int expectedDay = 2;
        int expectedMonth = 1;
        int expectedYear = 2018;
        int[] expectedDates = {expectedDay, expectedMonth, expectedYear};
        int[] actualDates = NextDayCalculator.getNextDay(day, month, year);
        assertArrayEquals(expectedDates, actualDates);
    }

    @Test
    @DisplayName("test 31/1/2018 => 1/2/2018")
    void testGetNextDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 2;
        int expectedYear = 2018;
        int[] expectedDates = {expectedDay, expectedMonth, expectedYear};
        int[] actualDates = NextDayCalculator.getNextDay(day, month, year);
        assertArrayEquals(expectedDates, actualDates);
    }

    @Test
    @DisplayName("test 30/4/2018 => 1/5/2018")
    void testGetNextDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 5;
        int expectedYear = 2018;
        int[] expectedDates = {expectedDay, expectedMonth, expectedYear};
        int[] actualDates = NextDayCalculator.getNextDay(day, month, year);
        assertArrayEquals(expectedDates, actualDates);
    }

    @Test
    @DisplayName("test 28/2/2018 => 1/3/2018")
    void testGetNextDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 3;
        int expectedYear = 2018;
        int[] expectedDates = {expectedDay, expectedMonth, expectedYear};
        int[] actualDates = NextDayCalculator.getNextDay(day, month, year);
        assertArrayEquals(expectedDates, actualDates);
    }

    @Test
    @DisplayName("test 29/2/2020 => 1/3/2020")
    void testGetNextDay4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int expectedDay = 1;
        int expectedMonth = 3;
        int expectedYear = 2020;
        int[] expectedDates = {expectedDay, expectedMonth, expectedYear};
        int[] actualDates = NextDayCalculator.getNextDay(day, month, year);
        assertArrayEquals(expectedDates, actualDates);
    }

    @Test
    @DisplayName("test 31/12/2018 => 1/1/2019")
    void testGetNextDay5() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 1;
        int expectedYear = 2019;
        int[] expectedDates = {expectedDay, expectedMonth, expectedYear};
        int[] actualDates = NextDayCalculator.getNextDay(day, month, year);
        assertArrayEquals(expectedDates, actualDates);
    }
}