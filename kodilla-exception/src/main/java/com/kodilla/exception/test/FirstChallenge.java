package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            return a / b;

        } catch (ArithmeticException e) {

            System.out.print("Sorry dividing by 0 is impossible");

        } finally {

            System.out.print("Is Done");

        }

        return 0;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}