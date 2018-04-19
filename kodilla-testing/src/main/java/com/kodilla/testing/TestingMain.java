package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator ();
        int result = calculator.addAToB(2, 5);
        if (result == 7) {
            System.out.println("test ok!");
        }else{
            System.out.println("test failed!");
        }

        Calculator calculator1 = new Calculator ();
        int result1 = calculator1.addAToB(2, 5);
        if (result1 == 7) {
            System.out.println("test ok!");
        }else{
            System.out.println("test failed!");
        }
    }

    }
