import java.time.LocalDate;

class Homework {
    public static void main(String[] args) {
        task1();

        task2();

        task3();
    }

    public static void checkingForALeapYear(int year) {
        int yearOfLeapYearIntroduction = 1584;

        if (year % 4 == 0 && year > yearOfLeapYearIntroduction && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "-ый год является високосным.");
        } else {
            System.out.println(year + "-ый год не является високосным.");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");

        int selectedYear = 2024;

        checkingForALeapYear(selectedYear);

        System.out.print("\n");
    }

    public static void checkingTheApplicationVersion(int clientOS, int clientDeviseYear, int currentYear) {
        if (clientOS == 0 && clientDeviseYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviseYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviseYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviseYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Приложение недоступно для операционной системы на Вашем устройстве.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int clientOS = 1;
        int clientDeviseYear = 2015;
        int currentYear = LocalDate.now().getYear();

        checkingTheApplicationVersion(clientOS, clientDeviseYear, currentYear);

        System.out.print("\n");
    }

    public static void calculationOfTheNumberOfDaysOfDelivery(int deliveryDistance) {
        int dayOfDelivery = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + dayOfDelivery + ".");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            dayOfDelivery++;
            System.out.println("Потребуется дней: " + dayOfDelivery + ".");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayOfDelivery = dayOfDelivery + 2;
            System.out.println("Потребуется дней: " + dayOfDelivery + ".");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 95;

        calculationOfTheNumberOfDaysOfDelivery(deliveryDistance);
    }
}

