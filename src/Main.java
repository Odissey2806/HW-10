import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2014);
        installApp(0, 2014);
        printDeliveryDays(120);
    }

    // Методы.
    // Задание №1
    public static boolean isLeapYear(int year) {
        if (year < 1584) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void checkLeapYear(int year) {
        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println("« " + year + " год является високосным»");
        } else {
            System.out.println("« " + year + " год не является високосным»");
        }
    }

    // Задание 2
    public static void installApp(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < 2015) {
            if (osType == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Неизвестный тип операционной системы");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите приложение для Android по ссылке");
            } else {
                System.out.println("Неизвестный тип операционной системы");
            }
        }
    }

    // Задание №3
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void printDeliveryDays(int deliveryDistance) {
        int days = calculateDeliveryDays(deliveryDistance);

        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка свыше 100 км невозможна.");
        }
    }
}