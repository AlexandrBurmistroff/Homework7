public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int salary = 15_000;
        int totalSalary = 0;
        int i = 0;

        while (totalSalary < 2_459_000) {
            totalSalary = totalSalary + salary;
            i++;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSalary + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        int j = 10;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; j > 0 ; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int year = 0;
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int difference = fertility - mortality;

        while (year < 10) {
            year++;
            population = population + population * difference / 1000;
            System.out.println("Год " + year + ", численность населения составяет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int month = 0;
        int salary = 15_000;
        int totalSalary = 0;

        while (totalSalary <= 12000000) {
            month++;
            totalSalary = totalSalary + salary + (salary / 100) * 7;

            System.out.println("Месяц " + month + ", сумма начисления составяет " + totalSalary);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int month = 0;
        int salary = 15_000;
        int totalSalary = 0;

        while (totalSalary <= 12000000) {
            month++;
            totalSalary = totalSalary + salary + (salary / 100) * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма начисления составяет " + totalSalary);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int month = 0;
        int salary = 15_000;
        int totalSalary = 0;

        while (month <= 12 * 9) {
            month++;
            totalSalary = totalSalary + salary + (salary / 100) * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма начисления составяет " + totalSalary);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        for (int day = 1; day <= 31; day++) {

            if (day % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int cometFlight = 0;
        int start = 200;
        int finish = 100;

        while (cometFlight <= 79 && start > finish) {
            cometFlight++;

            if (cometFlight % 79 == 0) {
                System.out.println("Сегодня пятница, " + cometFlight + "-е число. Необходимо подготовить отчет");
            }
        }
    }
}