package main.java.com.company;

public class Calculator {
    public int add(int a, int b) {
        //return -1;
        return a+b;
    }
    public int minus(int a, int b) {
        //return 0;
        return a-b;
    }
    public long multiply(int a, int b) {
        //return 0;
        return (long) a*b;
    }
    public double division(int a, int b) {
        //return 0;
        if (b != 0) {
            return (double) a / b;
        } else return 0;
    }
}
