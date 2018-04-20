package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator ();
        int sumResult = calculator.addAToB(2, 5);
        int subResult = calculator.substractAFromB(8, 5);


        if ((sumResult == 7) && (subResult == 3)) {
            System.out.println("test ok!");
        }else {
            System.out.println("test failed!");
        }

    }
}
