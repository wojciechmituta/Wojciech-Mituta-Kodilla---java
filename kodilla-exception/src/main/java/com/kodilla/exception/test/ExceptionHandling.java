package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 0);
        } catch (Exception e) {
            System.out.println("Sorry is impossible");
        } finally {
            System.out.println("Is done!");
        }
    }
}