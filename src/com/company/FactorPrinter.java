package com.company;

public class FactorPrinter {
    private int number;

    public FactorPrinter(int number) {
        this.number = number;
    }

    public void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Factor = " + i);
            }
        }
    }
}
