public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 2
        System.out.println("Задача 2");
        clientOS = 1;
        int clientDeviceYear = 2000;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // task 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("год является високосным");
            } else {
                System.out.println("год не является високосным");
            }
        } else {
            System.out.println("до високосного");
        }
        // task 4
        System.out.println("Задача 4");
        int deliveryDistance = 40;
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
            System.out.println("Потребуется дней:" + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
            System.out.println("Потребуется дней:" + days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
            System.out.println("Потребуется дней:" + days);
        } else {
            System.out.println("доставки нет");
        }
        // task 5
        System.out.println("Задача 5");
        int monthNumber = 20;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("такого месяца нет");
        }
    }
}