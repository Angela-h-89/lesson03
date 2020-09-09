package com.company;

import com.company.util.Checker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator Calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int add_value = Calculator.add(a,b);
        int minus_value = Calculator.minus(a,b);
        long multiply_value = Calculator.multiply(a,b);
        double division_value = Calculator.division(a,b);
        System.out.println("Сумма чисел: " + add_value);
        System.out.println("Разность чисел: " + minus_value);
        System.out.println("Произведение чисел: " + multiply_value);
        System.out.println("Деление чисел: " + division_value);
        Checker checker = new Checker();
        boolean isEven = checker.isEven(a);
        boolean isOdd = checker.isOdd(a);
        System.out.println("Первое число четное: ");
        System.out.println(isEven);
        System.out.println("Первое число нечетное: ");
        System.out.println(isOdd);
    }
}
