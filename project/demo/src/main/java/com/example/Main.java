package com.example;

public class Main {
    public boolean isPrime(int number) {
        if(number< 0) {
            return false;
        }
        for (int i = 2; i<= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    
    }
    public boolean isMultiple(int number, int divisor) {
        if(number % divisor == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}