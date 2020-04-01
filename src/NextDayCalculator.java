public class NextDayCalculator {
    public static final int FIRST_DAY = 1;
    public static final int STEP = 1;
    public static final int DECEMBER = 12;
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int APRIL = 4;
    public static final int JUNE = 6;
    public static final int SEPTEMBER = 9;
    public static final int NOVEMBER = 11;
    public static final int MAX_DAY = 31;

    public static int[] getNextDay(int day, int month, int year) {
        int amountDayOfMonth;
        if (month >= JANUARY && month <= DECEMBER && year >= 0) {
            amountDayOfMonth = getAmountOfMonth(month, year);
            if (day <= amountDayOfMonth && day > 0) {
                int[] nextDates = getNextDayMonthYearByAmountDay(amountDayOfMonth, day, month, year);
                return nextDates;
            } else {
                throw new UnsupportedOperationException();
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean isLeapYear(int year) {
        if (year >= 0) {
            boolean isLeapYear = false;
            boolean isDivisibleBy4 = year % 4 == 0;
            if (isDivisibleBy4) {
                boolean isDivisibleBy100 = year % 100 == 0;
                if (isDivisibleBy100) {
                    boolean isDivisibleBy400 = year % 400 == 0;
                    if (isDivisibleBy400) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }
            return isLeapYear;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static int getAmountOfMonth(int month, int year) {
        if (month >= JANUARY && month <= DECEMBER && year >= 0) {
            int amountDayOfMonth;
            switch (month) {
                case FEBRUARY:
                    if (isLeapYear(year)) {
                        amountDayOfMonth = 29;
                    } else {
                        amountDayOfMonth = 28;
                    }
                    break;
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    amountDayOfMonth = 30;
                    break;
                default:
                    amountDayOfMonth = 31;
            }
            return amountDayOfMonth;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static int[] getNextDayMonthYearByAmountDay(int amountDayOfMonth, int day, int month, int year) {
        if (day <= amountDayOfMonth && day >= FIRST_DAY && day <= MAX_DAY
                && month >= JANUARY && month <= DECEMBER && year >= 0 && amountDayOfMonth <= MAX_DAY) {
            int nextDay;
            int nextMonth;
            int nextYear;
            if (day == amountDayOfMonth) {
                nextDay = FIRST_DAY;
                if (month != DECEMBER) {
                    nextMonth = month + STEP;
                    nextYear = year;
                } else {
                    nextMonth = JANUARY;
                    nextYear = year + STEP;
                }
            } else {
                nextDay = day + STEP;
                nextMonth = month;
                nextYear = year;
            }
            int[] dates = {nextDay, nextMonth, nextYear};
            return dates;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}