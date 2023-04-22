package com.hw.maxim;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1();

        System.out.println("Задача 2");
        task2();

        System.out.println("Задача 3");
        task3();

        System.out.println("Задача 4");
        task4();

        System.out.println("Задача 5");
        task5();

        System.out.println("FizzBuzz");
        fizzBuzz();
    }

    private static void task1() {
        int goal = 2459000;
        int sum = 0;
        int monthlyDeposit = 15000;

        int i = 0;

        while (sum < goal) {
            sum += monthlyDeposit;
            i++;
            String msg = String.format("Месяц %s, сумма накоплений равна %s рублей", i, sum);
            System.out.println(msg);
        }

        System.out.println("Потребовалось месяцев: " + i);
    }

    private static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    private static void task3() {
        int population = 12000000;
        int birthIncr = 17;
        int deathDecr = 8;
        int term = 10;

        int year = 1;
        while (year <= term) {
            population += population * (birthIncr - deathDecr) / 1000;
            System.out.println(String.format("Год %s, численность населения составляет %s", year, population));
            year++;
        }
    }

    private static void task4() {
        int percent = 7;
        double sum = 15000;
        double goal = 12000000;

        int month = 1;

        while (sum < goal) {
            sum += sum * percent / 100;
            System.out.println(String.format("Месяц %s, сумма накоплений составляет %s", month, sum));
            month++;
        }
    }

    private static void task5() {
        int percent = 7;
        double sum = 15000;
        double goal = 12000000;

        int month = 1;

        while (sum < goal) {
            sum += sum * percent / 100;
            if (month % 6 == 0) {
                System.out.println(String.format("Месяц %s, сумма накоплений составляет %s", month, sum));
            }
            month++;
        }
    }

    private static void task6() {
        int percent = 7;
        double sum = 15000;
        int yearsCount = 9;

        int month = 1;

        while (month < yearsCount * 12) {
            sum += sum * percent / 100;
            if (month % 6 == 0) {
                System.out.println(String.format("Месяц %s, сумма накоплений составляет %s", month, sum));
            }
            month++;
        }
    }

    private static void task7() {
        int fridayNumber = 5;

        int dayInMonth = 31;
        int dayInWeek = 7;

        for (int i = fridayNumber; i < dayInMonth; i += dayInWeek) {
            System.out.println(String.format("Сегодня пятница, %s-е число. Необходимо подготовить отчет", i));
        }
    }

    private static void task8() {
        int cometFrequency = 79;
        int prevTerm = 200;
        int nextTerm = 100;

        int currentYear = 2023;
//        int currentYear = LocalDate.now().getYear();

        for (int i = currentYear - prevTerm; i < currentYear + nextTerm; i++) {
            if (i % cometFrequency == 0) {
                System.out.println(i);
            }
        }
    }

    /*
    Числа от 0 до 100
    Если число делится на 3, вместо него вывести «Fizz».
    Если число делится на 5, вместо него вывести «Buzz».
    А если число делится одновременно на 3 и на 5, то надо вместо него вывести «FizzBuzz».
    Иначе вывести само число
    * */
    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
