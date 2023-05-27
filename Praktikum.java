import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09" + " " + year); // високосный год
        }
        else {
            System.out.println("13.09" + " " + year); // не високосный год
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)); // здесь нужно определить, является ли переданный год високосным
        return isLeapYear;
    }
}