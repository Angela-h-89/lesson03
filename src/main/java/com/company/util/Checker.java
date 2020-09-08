package main.java.com.company.util;

public class Checker {
    public boolean isEven(int number) {
        //return false;
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isOdd(int number) {
        //return true;
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
