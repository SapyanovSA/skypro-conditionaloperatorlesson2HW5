//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите корректное значение 0 или 1");
        }

        //Task 2
        System.out.println("Task 2");

        clientOS = 0;
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите корректное значение 0 или 1");
        }

        //Task 3
        System.out.println("Task 3");

        int year = 1900;

        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4
        System.out.println("Task 4");

        int deliveryDistance = 101;
        int day = 0;

        if (deliveryDistance <= 20) {
            day = 1;
            System.out.println("Потребуется дней:" + day);
        } else if (deliveryDistance <= 60) {
            day = 2;
            System.out.println("Потребуется дней:" + day);
        } else if (deliveryDistance <= 100) {
            day = 3;
            System.out.println("Потребуется дней:" + day);
        } else {
            System.out.println("Доставки нет");
        }

        //Task 5
        System.out.println("Task 5");

        int monthNumber = 1;

        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(monthNumber + " месяц, относится к зиме");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + " месяц, относится к весне");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + " месяц, относится к лету");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + " месяц, относится к осени");
                break;
            default:
                System.out.println("Введите корректный месяц от 1 до 12");
        }
    }
}