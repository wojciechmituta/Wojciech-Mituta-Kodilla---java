package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;

        } catch (ArithmeticException e) {

            System.out.println("Sorry dividing by 0 is impossible");

        } finally {

            System.out.println("Is Done");

        }

        return 0;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0
        );

        System.out.println(result);

    }
}