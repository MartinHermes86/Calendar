package org.example;
public class Main {
    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Example usage
        for (int i = 0; i < months.length; i++) {
            printCalendarForMonth(months[i], daysInEachMonth[i], i % 7); // Example offset
        }
    }

    public static void printCalendarForMonth(String monthName, int daysInMonth, int offsetDays) {
        System.out.println("\n" + monthName);
        printWeekdays();

        int day = 1;
        // Print initial spaces for offset
        for (int i = 0; i < offsetDays; i++) {
            System.out.print("   ");
        }

        // Print calendar days
        while (day <= daysInMonth) {
            System.out.printf("%2d ", day);
            if ((day + offsetDays) % 7 == 0) {
                System.out.println();
            }
            day++;
        }
        System.out.println();
    }
    private static void printWeekdays() {
        System.out.println("Mo Tu We Th Fr Sa Su");
    }
}